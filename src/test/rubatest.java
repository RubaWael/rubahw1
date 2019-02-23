package test;

import static org.junit.Assert.*;

import org.junit.Test;

import hw1sw.book;
import hw1sw.product;

public class rubatest {

	@Test
	public void test1() {
book ru = new book ();

assertEquals(0,ru.getcount());	
	}
	@Test
	public void test2() {
book ru = new book ();
product p = new product("web",127,1);
ru.add(p);
assertEquals(1,ru.getcount());
assertEquals(127,ru.getprice());
	}
	@Test
	public void test3() {
book ru = new book ();
product p = new product("web",127,1);
product t = new product("java",100,1);
ru.add(p);
ru.add(t);
assertEquals(2,ru.getcount());
assertEquals(227,ru.getprice());
	}
	
}
