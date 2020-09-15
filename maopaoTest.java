package zhangxin;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class maopaoTest {

	@Test
	public void test() {
		int arr[]= {0,1,2,3,4,5};
		int[] arr1 = {0,1,2,3,4,5};
		String arr2 = Arrays.toString(arr1);
		maopao a = new maopao();
		assertEquals(a.m(arr),arr2);
	}
	@Test
	public void test1() {
		int arr[]= {5,4,3,2,1,0};
		int[] arr1 = {0,1,2,3,4,5};
		String arr2 = Arrays.toString(arr1);
		maopao a = new maopao();
		assertEquals(a.m(arr),arr2);
	}
	
	@Test
	public void test2() {
		int arr[]= {5,1,2,3,0,4};
		int[] arr1 = {0,1,2,3,4,5};
		String arr2 = Arrays.toString(arr1);
		maopao a = new maopao();
		assertEquals(a.m(arr),arr2);
	}
	@Test
	public void test3() {
		int arr[]= {5,3,2,0,4,1};
		int[] arr1 = {0,1,2,3,4,5};
		String arr2 = Arrays.toString(arr1);
		maopao a = new maopao();
		assertEquals(a.m(arr),arr2);
	}

}
