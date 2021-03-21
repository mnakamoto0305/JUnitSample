package sample.junit;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class ItemStockTest {

	public static class 初期状態の場合 {
		ItemStock sut;
		Item item;

		@Before
		public void setUp() {
			List<Item> itemList = new ArrayList<>();
			sut = new ItemStock(itemList);
			item = new Item("お茶", 150);
		}

		@Test
		public void getNumで0が取得できる() {
			assertThat(sut.getNum(item), is(0));
		}

		@Test
		public void addでitemを追加するとgetNumで1が取得できる() {
			sut.add(item);
			assertThat(sut.getNum(item), is(1));
		}
 	}

	public static class Itemが1つ追加されている場合 {
		ItemStock sut;
		Item tea;

		@Before
		public void setUp() {
			List<Item> itemList = new ArrayList<>();
			sut = new ItemStock(itemList);
			tea = new Item("お茶", 150);
			sut.add(tea);
		}

		@Test
		public void getNumで1が取得できる() {
			assertThat(sut.getNum(tea), is(1));
		}

		@Test
		public void addでitemを追加するとgetNumで2が取得できる() {
			sut.add(tea);
			assertThat(sut.getNum(tea), is(2));
		}

		@Test
		public void addでriceを追加するとgetNumで1が取得できる() {
			Item rice = new Item("お米", 1000);
			sut.add(rice);
			assertThat(sut.getNum(rice), is(1));
		}
 	}

}
