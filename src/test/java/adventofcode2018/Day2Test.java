package adventofcode2018;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.util.StringUtils;

public class Day2Test {

	@Test
	public void checkSum_12() {

		// give
		List<String> collectIDs = new ArrayList<String>();
 
		collectIDs.add("abcdef");
		collectIDs.add("bababc");
		collectIDs.add("abbcde");
		collectIDs.add("abcccd");
		collectIDs.add("aabcdd");
		collectIDs.add("abcdee");
		collectIDs.add("ababab");

		Day2 day2Test = new Day2();

		// then
		int checkSumResult = day2Test.checkSumByIDs(collectIDs);

		assertEquals(12, checkSumResult);

	}
	
	
	@Test
	public void my_puzzle_input_day2() {
		

		// give
		List<String> collectIDs = new ArrayList<String>();
		Day2 day2Test = new Day2();
		
		collectIDs.add("kqzxdenujwcsthbzgvyioflcsp");
		collectIDs.add("vqwxdenujwcsthbmggyioflarp");
		collectIDs.add("kqzxienujwcsthbmglyioclarp");
		collectIDs.add("kuzxdetujwcsthbmgvyioflcrp");
		collectIDs.add("kqnxdenujwcsthbmgvlooflarp");
		collectIDs.add("kqzxdknpjwcsthwmgvyioflarp");
		collectIDs.add("kgzxdenujwcsthbfgvyicflarp");
		collectIDs.add("kqzxdenujrnsthbmgjyioflarp");
		collectIDs.add("lqzxdeeujwcsthbmrvyioflarp");
		collectIDs.add("iqfxdenujwcsthbmgvyiofyarp");
		collectIDs.add("kvzxbenujwcstabmgvyioflarp");
		collectIDs.add("kmzxdenujwcsthbmglyioolarp");
		collectIDs.add("kqzxdenujhcsthbmgbyioflanp");
		collectIDs.add("nqzxdenujwcsehbmgvsioflarp");
		collectIDs.add("kqzlgenujwcsthbmgvyiofjarp");
		collectIDs.add("kqzxdyfujwcsihbmgvyioflarp");
		collectIDs.add("kqzxdsnujwcqthbmgvyiorlarp");
		collectIDs.add("kqzxdenuywcsthbmgvyinflmrp");
		collectIDs.add("knzxderujwcsthbmgvyioflaop");
		collectIDs.add("kqxxdenujwczthbmgvyioflajp");
		collectIDs.add("kqzxdevujwcsthbmgvyqoxlarp");
		collectIDs.add("kqzxdenujwclmhbmgvyioslarp");
		collectIDs.add("kqzldenujwcsthbmgvnisflarp");
		collectIDs.add("kjtxdenujwcsthbmgvyfoflarp");
		collectIDs.add("kqzxwenujwcstxbmgvyihflarp");
		collectIDs.add("kqzxdenuhecsthbmgvyeoflarp");
		collectIDs.add("kqzxdenhjwesthbmgvyioklarp");
		collectIDs.add("kqkxdenujwcsthbcgvyiofgarp");
		collectIDs.add("kqyxmenujwcsthbmgvyioflara");
		collectIDs.add("kqzxdqnrjwcwthbmgvyioflarp");
		collectIDs.add("kqzxdenufwcgyhbmgvyioflarp");
		collectIDs.add("lqzxdenujwcsthbmtvyiofearp");
		collectIDs.add("kqzxdenujwcsthbvgvthoflarp");
		collectIDs.add("kqzxeenujwcsahbmgvyioflamp");
		collectIDs.add("pqzxdenujwcsshbmjvyioflarp");
		collectIDs.add("kqzxdesujwcstdbmgvyioflatp");
		collectIDs.add("kqzxpenujwcsthimgvyioflhrp");
		collectIDs.add("kqzxdmkujwcsthbmgvpioflarp");
		collectIDs.add("kszxdenujwcsthbybvyioflarp");
		collectIDs.add("kqzxdvnujwcsthbmgvyqoslarp");
		collectIDs.add("kkzxdetujwcsthbmgvyiofltrp");
		collectIDs.add("kqzxdenujwcsthomgvyiozlaro");
		collectIDs.add("cqzfdenubwcsthbmgvyioflarp");
		collectIDs.add("kqzxdenyjwcsthbmhvyiofldrp");
		collectIDs.add("kqzxdenujwcsthbmghfiofxarp");
		collectIDs.add("kmqxdebujwcsthbmgvyioflarp");
		collectIDs.add("kqzxdenufwcsthbmvvypoflarp");
		collectIDs.add("kqnxdenujwcsthbmgvtzoflarp");
		collectIDs.add("bqzxdenujwcithbmgvyiohlarp");
		collectIDs.add("kqzxdenurwrsthbmgvyioelarp");
		collectIDs.add("kqzxdenujwcsthbmgpyiodlarl");
		collectIDs.add("kqzxdengjwcxthbmgvjioflarp");
		collectIDs.add("kizxdenujwcsnhqmgvyioflarp");
		collectIDs.add("jqzxdenajwcsthbmnvyioflarp");
		collectIDs.add("kqzcdenujwcsphbigvyioflarp");
		collectIDs.add("kezxdenujwcsthbfgvyioflaqp");
		collectIDs.add("kqzxdenujwcstybmgvyivfyarp");
		collectIDs.add("kqzxdenujwcsthbmgvbiofsnrp");
		collectIDs.add("kqzxdenujwcsthbmgvyhxfnarp");
		collectIDs.add("kvzxdenqjfcsthbmgvyioflarp");
		collectIDs.add("kqzxywnljwcsthbmgvyioflarp");
		collectIDs.add("kqzxdenujwcsbhbzgvyioxlarp");
		collectIDs.add("kqkxdenufwcsthbmgvyiofxarp");
		collectIDs.add("dqzxddnujwcsthsmgvyioflarp");
		collectIDs.add("yqrxdenujwcsthbagvyioflarp");
		collectIDs.add("kqzxdenujwcsajbmgvyiovlarp");
		collectIDs.add("kqztdunujwcsthbmgvyioilarp");
		collectIDs.add("kqzxdequjwcsthbmgvyyoflarm");
		collectIDs.add("kqzxdlnujwksthbmgvkioflarp");
		collectIDs.add("tqvxdenujwcsthbmgveioflarp");
		collectIDs.add("kqzndezupwcsthbmgvyioflarp");
		collectIDs.add("kqzctsnujwcsthbmgvyioflarp");
		collectIDs.add("kqzxdenujwmstkbmgvyioflgrp");
		collectIDs.add("kqzxdenujwzsthdmgvyiofdarp");
		collectIDs.add("kqzxdynujwcsthcmgvyioflasp");
		collectIDs.add("kqzxdesujwcstybmgcyioflarp");
		collectIDs.add("kqzxdenujwcsthbvgvyiyglarp");
		collectIDs.add("kqzxpenujwcsthbogvyioflard");
		collectIDs.add("khzxdenujwcsthbmgvyikflaep");
		collectIDs.add("kqzxdedujwchthbmgvyeoflarp");
		collectIDs.add("kxzxsepujwcsthbmgvyioflarp");
		collectIDs.add("xqzxdenujwcsthbpgvyioelarp");
		collectIDs.add("jfzxdenujwcsthbmgvyiollarp");
		collectIDs.add("kqzxcenujwcethbmgvwioflarp");
		collectIDs.add("kqzxdenujwcithbmgvysoflarg");
		collectIDs.add("kqlxdenujwnsthbmgvyiotlarp");
		collectIDs.add("wqzydenujwcsthbmgvyioftarp");
		collectIDs.add("kqzxienuwwcsthbmgayioflarp");
		collectIDs.add("kqzxdetujwcsthbmgvyhoflawp");
		collectIDs.add("kqzxdqnujwrsthbmgvyxoflarp");
		collectIDs.add("kqzxdenujwcvthbmgjiioflarp");
		collectIDs.add("kqzxdenujwcjthbxgvaioflarp");
		collectIDs.add("kqzxpenujwcsthymgvyioklarp");
		collectIDs.add("kqzxdenujwcsthbmswygoflarp");
		collectIDs.add("kqzxdenujwcsthbmgvyiaxiarp");
		collectIDs.add("kqzxdenudkcsthbmgvyzoflarp");
		collectIDs.add("kqzxdvndjwcsthbmgvyioflaxp");
		collectIDs.add("kqzxdenujwcsthbmdvymoflvrp");
		collectIDs.add("kqzxvenujwcsihbmgvyiofllrp");
		collectIDs.add("kqzxdqnujwcsthbmgtyioflprp");
		collectIDs.add("kqzxdenuuwcathbmgvsioflarp");
		collectIDs.add("kqzrdenujwesthbjgvyioflarp");
		collectIDs.add("kqzxdexujwcstzbmgvyyoflarp");
		collectIDs.add("kqzxpenujwjstabmgvyioflarp");
		collectIDs.add("kozxdenejwcsthbmgvpioflarp");
		collectIDs.add("kbzxdenvjwcsthbmgvyiofsarp");
		collectIDs.add("kolxdenujwcjthbmgvyioflarp");
		collectIDs.add("kqzxdenujwcsthbmgvyiffsakp");
		collectIDs.add("kqzxdelujwcsthbmlvyioflxrp");
		collectIDs.add("kqzxdenugwcsthrmgvyioflprp");
		collectIDs.add("kqzxdelujwcsthqmgvyiozlarp");
		collectIDs.add("kqzxienujwosthbmgvykoflarp");
		collectIDs.add("kqzxdeuujwicthbmgvyioflarp");
		collectIDs.add("kqzxdenbjwcsthbmcvyaoflarp");
		collectIDs.add("krzxdqnujwcsthbmgvyioflerp");
		collectIDs.add("wqzxzenujwcsthbmgvyioclarp");
		collectIDs.add("kqzxyenujwcsthbmgejioflarp");
		collectIDs.add("kqzxdenujwcstsbmgvtidflarp");
		collectIDs.add("kqnxdenejwcsthbmgvyioflara");
		collectIDs.add("kqzsdmnujwcsthbmgvyioflaep");
		collectIDs.add("kqzxdedujwnsthymgvyioflarp");
		collectIDs.add("kqzxdenujwusthbmgnyioflarx");
		collectIDs.add("kqzxlenujwcsthbmgayvoflarp");
		collectIDs.add("kqzxdenujwcsthbmgvyiofngrh");
		collectIDs.add("zqzxdenujwcsthbmgvyiofvxrp");
		collectIDs.add("kqzydenujwmsthbmgvyiuflarp");
		collectIDs.add("kqzxdenujkrsthbmdvyioflarp");
		collectIDs.add("kqzxdlnujocsthbmgvyiofaarp");
		collectIDs.add("kqzxdenujwcstybmgvyiofrwrd");
		collectIDs.add("kqzxdenupwksthbmgvyiofbarp");
		collectIDs.add("khzxdentjwcsthbmbvyioflarp");
		collectIDs.add("kqzxdenujwcuphbmgvyihflarp");
		collectIDs.add("kqzxdenhjwcgthbmgvyioflrrp");
		collectIDs.add("kqzxdenujwcsthbmgvyiofakhp");
		collectIDs.add("kqzxdenujwcstfkmgvyioflamp");
		collectIDs.add("kqzxdenujqcsthbmgvkiorlarp");
		collectIDs.add("kqzxdenujwcstvbmgvyioilasp");
		collectIDs.add("kqzxdxnujwcsthbpgayioflarp");
		collectIDs.add("kqzxdenupwysthbmgvyiofljrp");
		collectIDs.add("kqzxdenujwcdthbmgvymoflarv");
		collectIDs.add("kqnxdenujwcstvbmgvyixflarp");
		collectIDs.add("kqjxdenujwcsthbmgvyikflurp");
		collectIDs.add("kqsxdenulwcsthxmgvyioflarp");
		collectIDs.add("bqzxbenujwcsahbmgvyioflarp");
		collectIDs.add("vqzxdenujwcsthbmgvjzoflarp");
		collectIDs.add("kqzhfenujwcsthimgvyioflarp");
		collectIDs.add("eqzxdenujwcshhbmgnyioflarp");
		collectIDs.add("kqzxdenujucstubmgvyicflarp");
		collectIDs.add("kuzxdenuewcsthbmgvyiofuarp");
		collectIDs.add("kqzxdenulwcsthbmgpyigflarp");
		collectIDs.add("kqzxdebujwcsthbmgoyioflaro");
		collectIDs.add("kqzxdenujwcuthbmgucioflarp");
		collectIDs.add("kqzxdenujwcschpmgvyioflhrp");
		collectIDs.add("kqzxfenujwcsthbmjvrioflarp");
		collectIDs.add("kqzxdenujqcsthbmgvyndflarp");
		collectIDs.add("kqzxdgnbjwcsthbmgvywoflarp");
		collectIDs.add("kqzxdenujwcsthrmgtbioflarp");
		collectIDs.add("yqzxdenyjwcsthbmgvyioflarg");
		collectIDs.add("kqzxdenuxwxsthbmsvyioflarp");
		collectIDs.add("kqzxdenujwcsthbugqyvoflarp");
		collectIDs.add("qqzxdenujwcsahbmgoyioflarp");
		collectIDs.add("kqsxdenudwcsthbmguyioflarp");
		collectIDs.add("kqzxdenujwcstublgvyioflamp");
		collectIDs.add("kqzxdemujwtstqbmgvyioflarp");
		collectIDs.add("kqzxqvnajwcsthbmgvyioflarp");
		collectIDs.add("kqzxoennjwcstbbmgvyioflarp");
		collectIDs.add("kqzxfenujwcsthbmlvyioflwrp");
		collectIDs.add("kqzjdunujwcsthhmgvyioflarp");
		collectIDs.add("kqzxdenujwcqthbmgvyirfxarp");
		collectIDs.add("kqzxdengjwcsthbmgvyiowlgrp");
		collectIDs.add("kqgxdenujwcswhbmglyioflarp");
		collectIDs.add("mqzxdekuuwcsthbmgvyioflarp");
		collectIDs.add("kqzxdenujwdsthbmgbyiovlarp");
		collectIDs.add("krzxdenlhwcsthbmgvyioflarp");
		collectIDs.add("kqzxdenmjwcstqbmgvyioflanp");
		collectIDs.add("kqzxdenujwcmthbmgvtioflyrp");
		collectIDs.add("kqzxdenujwcsthbmgvaijflprp");
		collectIDs.add("kqzxdenuywysqhbmgvyioflarp");
		collectIDs.add("kqzxdenujwfsthbmgvyhoflark");
		collectIDs.add("nqzcdefujwcsthbmgvyioflarp");
		collectIDs.add("kqzxdenujrcsthgmgyyioflarp");
		collectIDs.add("kqzxdqnujwzsthbmgvyioftarp");
		collectIDs.add("kqzxdenujwcsthimgvyioolapp");
		collectIDs.add("kqzxdenupwcsthbmggyioflyrp");
		collectIDs.add("kqzxdjnujwcsthbvgvyioflarf");
		collectIDs.add("kqzxdtnujwasthbmgvyiofuarp");
		collectIDs.add("kqzxbensjzcsthbmgvyioflarp");
		collectIDs.add("kqzxdenujwcsphbmwiyioflarp");
		collectIDs.add("kqzgdenuowcsthbmgvyioflarh");
		collectIDs.add("kmzxdenujwasthbmgvtioflarp");
		collectIDs.add("kqzxdenujwcstybmgvyiofrard");
		collectIDs.add("vqzxdenejwcsthbmglyioflarp");
		collectIDs.add("kqhxdenujwcsmhbmgvyioflprp");
		collectIDs.add("kqzxdnnujwcsthzsgvyioflarp");
		collectIDs.add("kczxdenujwcsthbmgvyeoflaop");
		collectIDs.add("kqzxdenujwcsxhbmgvaioflaap");
		collectIDs.add("kqzxdenujwcsthbmgayiofnprp");
		collectIDs.add("kqzxdvnujwcsthbmgvyipjlarp");
		collectIDs.add("kqzxdenubwcskhbmgvyiofkarp");
		collectIDs.add("kqzxdenujwcsthbgggyigflarp");
		collectIDs.add("kqzxdenujncstabvgvyioflarp");
		collectIDs.add("kqzxdenujwcstqimqvyioflarp");
		collectIDs.add("kqzxeenujwcsdhbmgvyqoflarp");
		collectIDs.add("kcpxdenujwcsthbmgvyioilarp");
		collectIDs.add("kqwxuenujwcsthbmgvyiyflarp");
		collectIDs.add("kqzxdwnujwcstgbmgvyioplarp");
		collectIDs.add("kqzxdenuswcstvbmglyioflarp");
		collectIDs.add("kqzxdenujwcsthabgvyiwflarp");
		collectIDs.add("kqzxdpnujwcsthbmwvyiomlarp");
		collectIDs.add("kqzxdenujwcdthbmgvcioffarp");
		collectIDs.add("kqzxdenajwcsthbmtvyiofldrp");
		collectIDs.add("kqzbnenujwcshhbmgvyioflarp");
		collectIDs.add("kqzbdequiwcsthbmgvyioflarp");
		collectIDs.add("kqzxdenuswcsohbmgzyioflarp");
		collectIDs.add("kvzxdenujwcstdbmjvyioflarp");
		collectIDs.add("kqzxoenujwcqthbmpvyioflarp");
		collectIDs.add("kqzxhenujwcsthbmgoyiofoarp");
		collectIDs.add("klzxdenujwczthbmgvyioflanp");
		collectIDs.add("kqpxdenujwcsthbmgvyioflafz");
		collectIDs.add("kqkxdenujwcstxbngvyioflarp");
		collectIDs.add("kqzepenuxwcsthbmgvyioflarp");
		collectIDs.add("bqzxdenujmcithbmgvyioflarp");
		collectIDs.add("kdzxdjnujwcstnbmgvyioflarp");
		collectIDs.add("kszxdenujwcsthbmgeyiofrarp");
		collectIDs.add("kqzxdenijwcsthbmgvhiaflarp");
		collectIDs.add("kqzadenujwcbtxbmgvyioflarp");
		collectIDs.add("kqkxwenujwcsthbmgvyiowlarp");
		collectIDs.add("pqzddenujwcsthbmgvyboflarp");
		collectIDs.add("kqzxxenujwcsthbwgvyioflmrp");
		collectIDs.add("kqzxdjnujwcsthbmgvyipilarp");
		collectIDs.add("pqzxdenujwcsthbmgvyieflark");
		collectIDs.add("sqzxdenujtcsthbmgiyioflarp");
		collectIDs.add("kqzxdznujwcsthbmgvzioflajp");
		collectIDs.add("kqzxdrnujqcsthbmgvyiofvarp");
		collectIDs.add("gqzxdenujwcsthemgvlioflarp");
		collectIDs.add("kqzxdenujjcsthbmgvuiofljrp");
		collectIDs.add("kqzsdenujmcsthbmggyioflarp");
		collectIDs.add("kqzxienujwcsthbmgvaioflaip");
		collectIDs.add("kqzxdwnujwcstfkmgvyioflarp");
		collectIDs.add("kqzqdenujwcithbmzvyioflarp");
		collectIDs.add("kqzxdedpjwcsthbmgvyiofbarp");
		collectIDs.add("kqzxdeaujwcbtdbmgvyioflarp");
		collectIDs.add("kqzewenyjwcsthbmgvyioflarp");
		collectIDs.add("kqzxddnujwcsthbmgyyiofrarp");
		collectIDs.add("kqzxdtnujwcsthbmgvyiodlard");
		collectIDs.add("kqzxdefujwcsthbmgvyiffwarp");
		collectIDs.add("xczxdenujwcsthbmgvyooflarp");
		collectIDs.add("kuzxdenujucsthbmgvykoflarp");
		collectIDs.add("kqzxtenujwcwthbmgvyioplarp");
		collectIDs.add("kqzxdencllcsthbmgvyioflarp");
		
		int checkSum = day2Test.checkSumByIDs(collectIDs);
		
		assertEquals(7470, checkSum);

		
	}

}
