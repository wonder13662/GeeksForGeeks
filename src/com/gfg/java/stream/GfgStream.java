package com.gfg.java.stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class GfgStream {
	
	

	private GfgStream() {}

	public static void main(String[] args) {
//		example_01();
//		example_02();
//		example_03();
//		example_04();
//		example_05();
//		example_06();
//		example_07();
//		example_08();
//		example_09();
//		example_10();
//		example_11();
//		example_12();
//		example_13();
//		example_14();
//		example_15();
//		example_16();
//		example_17();
//		example_18();
		example_19();
	}
	
	private static void example_01() {
		// https://futurecreator.github.io/2018/08/26/java-8-streams/
		// https://www.geeksforgeeks.org/stream-in-java/
		// 1. 배열 스트림
		String[] arr = new String[] {"a", "b", "c"};
		Stream<String> stream = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
	}
	
	private static void example_02() {
		// https://futurecreator.github.io/2018/08/26/java-8-streams/
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> stream = list.stream();
		Stream<String> parallelStream = list.parallelStream();	// 병렬 처리 스트림
	}
	
	private static void example_03() {
		// 비어 있는 스트림
		Stream<String> emptyStream = streamOf(null);
		Stream<String> stream = streamOf(Arrays.asList("a", "b", "c"));
		stream.forEach(System.out::println);
	}
	
	private static Stream<String> streamOf(List<String> list) {
		return list == null || list.isEmpty()?Stream.empty():list.stream();
	}
	
	private static void example_04() {
		// Stream.builder()
		Stream<String> builderStream = Stream.<String>builder().add("Eric").add("Elena").add("Java").build();
		builderStream.forEach(System.out::println);
	}
	
	private static void example_05() {
		// Stream.generate()
		Stream<String> generatedStream = Stream.generate(() -> "gen").limit(5);
		generatedStream.forEach(System.out::println);
	}
	
	private static void example_06() {
		// Stream.iterate()
		Stream<Integer> iteratedStream = Stream.iterate(30, n -> n + 2).limit(5);
		iteratedStream.forEach(System.out::println);
	}
	
	private static void example_07() {
		// 기본 타입형 스트림
		IntStream intStream = IntStream.range(1, 5);
		intStream.forEach(System.out::println);
		
		LongStream longStream = LongStream.rangeClosed(1,5);
		longStream.forEach(System.out::println);
		
		// auto-boxing
		Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed();
		boxedIntStream.forEach(System.out::println);
		
		// Random class
		DoubleStream doublesStream = new Random().doubles(3);
		doublesStream.forEach(System.out::println);
	}
	
	private static void example_08() {
		// 문자열 스트링
		IntStream charsStream = "Stream".chars();
		charsStream.forEach(System.out::println);
		
		Stream<String> stringStream = Pattern.compile(", ").splitAsStream("Eric, Elena, Java");
		stringStream.forEach(System.out::println);
	}
	
	private static void example_09() {
		// 파일 스트림
		try {
			Stream<String> lineStream = Files.lines(Paths.get("src/com/gfg/java/stream/file.txt"), Charset.forName("UTF-8"));
			lineStream.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void example_10() {
		// 병렬 스트림 Parallel Stream
		Stream<String> parallelStream = Stream.<String>builder().add("Eric").add("Elena").add("Java").build().parallel();
		
		boolean isParallel = parallelStream.isParallel();
		System.out.println(String.format("isParallel:'%b'", isParallel));
		
		boolean hasJava = parallelStream.map(str -> str + "_added").anyMatch(str -> str.contains("Java"));
		System.out.println(String.format("hasJava:'%b'", hasJava));
		
		IntStream intStream = IntStream.range(1, 150).parallel();
		isParallel = intStream.isParallel();
		System.out.println(String.format("isParallel:'%b'", isParallel));
		
		intStream = intStream.sequential();
		isParallel = intStream.isParallel();
		System.out.println(String.format("isParallel:'%b'", isParallel));
	}
	
	private static void example_11() {
		// 스트림 연결하기
		Stream<String> stream1 = Stream.of("Java", "Scala", "Groovy");
		Stream<String> stream2 = Stream.of("Python", "Go", "Swift");
		Stream<String> streamConcat = Stream.concat(stream1, stream2);
		streamConcat.forEach(System.out::println);
	}
	
	private static void example_12() {
		// 가공하기
		// 중간 작업(intermediate operations)
		List<String> names = Arrays.asList("Eric", "Elena", "Java");
		
		// Filtering
		Stream<String> stream = names.stream().filter(name -> name.contains("a"));
		stream.forEach(System.out::println);
		
		// Mapping
		stream = names.stream().map(String::toUpperCase);
		stream.forEach(System.out::println);
		
		// Flattening
		List<List<String>> list = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));
		List<String> flatList = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
		flatList.stream().forEach(System.out::println);
	}
	
	private static void example_13() {
		// Sorting
		List<Integer> list = IntStream.of(14,11,20,39,23).sorted().boxed().collect(Collectors.toList());
		list.stream().forEach(System.out::println);
	}
	
	private static void example_14() {
		// Sorting
		List<String> lang = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");
		
		lang.stream()
		.sorted()
		.collect(Collectors.toList())
		.forEach(System.out::println);
		// [Go, Groovy, Java, Python, Scala, Swift]
		
		System.out.println();
		
		lang.stream()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		// [Swift, Scala, Python, Java, Groovy, Go]
		
		System.out.println();
		
		lang.stream()
		.sorted(Comparator.comparingInt(String::length))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		// [Go, Java, Scala, Swift, Groovy, Python]
		
		System.out.println();
		
		lang.stream()
		.sorted((s1, s2) -> s2.length() - s1.length())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		// [Groovy, Python, Scala, Swift, Java, Go]
	}
	
	private static void example_15() {
		// Iterating
		int sum = IntStream.of(1,3,5,7,9)
				.peek(System.out::println)
				.sum();
		
		System.out.println(String.format("sum:'%d'", sum));
	}
	
	private static void example_16() {
		// Terminal operations
		// 1. Calculating
		long count = IntStream.of(1,3,5,7,9).count();
		System.out.println(String.format("count:'%d'", count));
		long sum = LongStream.of(1,3,5,7,9).sum();
		System.out.println(String.format("sum:'%d'", sum));
		
		OptionalInt min = IntStream.of(1,3,5,7,9).min();
		System.out.println(String.format("min:'%d'", min.getAsInt()));
		OptionalInt max = IntStream.of(1,3,5,7,9).max();
		System.out.println(String.format("max:'%d'", max.getAsInt()));
		
		DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5)
		.average()
		.ifPresent(System.out::println);
	}
	
	private static void example_17() {
		// Terminal operations
		// 2. Reduction
		
		// 2-1. accumulator
		OptionalInt reduced = IntStream.range(1, 4).reduce((a,b) -> Integer.sum(a, b));
		System.out.println(String.format("reduced:'%d'", reduced.getAsInt()));
		
		// 2-2. identity, accumulator
		int reducedTwoParams = IntStream.range(1, 4).reduce(10, Integer::sum); // 10 + 1 + 2 + 3
		System.out.println(String.format("reducedTwoParams:'%d'", reducedTwoParams));
		
		// 2-3. identity, accumulator, combiner
		// 2-3-1. Sequential
		Integer reducedSequential = 
				Stream.of(1,2,3)
				.reduce(10, 
						Integer::sum, 
						(a, b) -> {
							System.out.println("2-3-1. Sequential / combiner was called");
							return a + b;
						});
		
		System.out.println(String.format("reducedParams:'%d'", reducedSequential));
		
		// 2-3-2. Parallel
		Integer reducedParallel = 
				Arrays.asList(1,2,3)
				.parallelStream()
				.reduce(10, 
						Integer::sum, 
						(a, b) -> {
							System.out.println("2-3-2. Parallel / combiner was called");
							return a + b;
						});
		
		System.out.println(String.format("reducedParallel:'%d'", reducedParallel));
	}
	
	private static class Product {
		private final int amount;
		private final String name;
		
		public Product(int id, String name) {
			this.amount = id;
			this.name = name;
		}

		public int getAmount() {
			return amount;
		}

		public String getName() {
			return name;
		}
		
		public String toString() {
			return String.format("name:'%s' / amount:'%d'", getName(), getAmount());
		}
	}
	
	private static void example_18() {
		// Collecting
		List<Product> productList = 
				Arrays.asList(
				new Product(23, "potatoes"),
				new Product(14, "orange"),
				new Product(13, "lemon"),
				new Product(23, "bread"),
				new Product(13, "sugar"));
		
		// Collectors.toList()
		List<String> collectorCollection = 
				productList.stream()
				.map(Product::getName)
				.collect(Collectors.toList());
		
		collectorCollection.forEach(System.out::println);
		
		// Collectors.joining()
		String listToString = 
				productList.stream()
				.map(Product::getName)
				.collect(Collectors.joining());
		
		System.out.println(String.format("listToString:'%s'", listToString));
		
		String listToString2 = 
				productList.stream()
				.map(Product::getName)
				.collect(Collectors.joining(", ","<",">"));
		
		System.out.println(String.format("listToString2:'%s'", listToString2));
		
		// Collectors.averageingInt()
		Double averageAmount = productList.stream().collect(Collectors.averagingInt(Product::getAmount));
		System.out.println(String.format("averageAmount:'%f'", averageAmount));
		
		// Collectors.summingInt()
		Integer summingAmount = productList.stream().collect(Collectors.summingInt(Product::getAmount));
		System.out.println(String.format("summingAmount:'%d'", summingAmount));
		
		// Collectors.summarizingInt()
		// 합계와 평균 모두 필요
		IntSummaryStatistics statistics = productList.stream().collect(Collectors.summarizingInt(Product::getAmount));
		System.out.println(String.format("statistics:'%s'", statistics));
		
		// Collectors.groupingBy()
		Map<Integer, List<Product>> collectorMapOfLists = 
				productList
				.stream()
				.collect(Collectors.groupingBy(Product::getAmount));
		
		Iterator<Integer> keys = collectorMapOfLists.keySet().iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			List<Product> list = collectorMapOfLists.get(key);
			for (Product product : list) {
				System.out.println(String.format("key:'%d' / %s", key, product));
			}
		}
		
		// Collectors.partitioningBy()
		Map<Boolean, List<Product>> mapPartitioned = productList.stream().collect(Collectors.partitioningBy(el -> el.getAmount() > 15));
		
		Iterator<Boolean> booleanKeys = mapPartitioned.keySet().iterator();
		while(booleanKeys.hasNext()) {
			Boolean key = booleanKeys.next();
			List<Product> list = mapPartitioned.get(key);
			for (Product product : list) {
				System.out.println(String.format("key:'%b' / %s", key, product));
			}
		}
		
		// Collectors.collectingAndThen()
		// 수정불가한 Set 으로 변환
		Set<Product> unmodifiableSet = productList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
		System.out.println();
		unmodifiableSet.forEach(System.out::println);
		
		// Collector.of()
		Collector<Product, ?, LinkedList<Product>> toLinkedList = 
				Collector.of(
						LinkedList::new, 
						LinkedList::add, 
						(first, second) -> {
							first.addAll(second);
							return first;
						});
		
		LinkedList<Product> linkedListOfPersons = productList.stream().collect(toLinkedList);
		System.out.println();
		linkedListOfPersons.forEach(System.out::println);
	}
	
	private static void example_19() {
		// Matching
		List<String> names = Arrays.asList("Eric", "Elena", "Java");
		
		boolean anyMatch = names.stream().anyMatch(name -> name.contains("a"));
		System.out.println(String.format("anyMatch:'%b'", anyMatch));
		
		boolean allMatch = names.stream().allMatch(name -> name.length() > 3);
		System.out.println(String.format("allMatch:'%b'", allMatch));
		
		boolean noneMatch = names.stream().noneMatch(name -> name.endsWith("s"));
		System.out.println(String.format("noneMatch:'%b'", noneMatch));
	}
}
