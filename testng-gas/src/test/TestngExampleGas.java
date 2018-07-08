package test;


import org.testng.annotations.Test;

import org.testng.*;

import fwk.Beopt;

public class TestngExampleGas
{
	@Test
	@Beopt("20180601")
	public void test2_1()
	{
		System.out.println("test2_1 - 20180601. Thread: " + Thread.currentThread().getId());
	}

	@Test
	@Beopt("20180601")
	public void test2_2()
	{
		System.out.println("test2_2 - 20180601. Thread: " + Thread.currentThread().getId());
	}
	
	@Test
	@Beopt("20180601")
	public void test2_3()
	{
		System.out.println("test2_3 - 20180601. Thread: " + Thread.currentThread().getId());
	}
	@Test
	@Beopt("20160101")
	public void test2_4()
	{
		System.out.println("test4_4 - 20160101. Thread: " + Thread.currentThread().getId());
	}
}
