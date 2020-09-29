import java.util.*;

public class Kings {
	private List<King> list = new ArrayList();
	
	public Kings() {
		for(String[] arr : data)
			list.add(new King(arr[0],
					Integer.parseInt(arr[1]),
					Integer.parseInt(arr[2])));	
	}
	public List<King> getKings(){
		return list;
	}
	

	private static final String[][] data = {
			{"태조", "1392", "1398"},
			{"정종", "1398", "1400"},
			{"태종", "1200", "1418"},
			{"세종", "1418", "1450"},
			{"문종", "1450", "1452"},
			{"단종", "1452", "1455"},
			{"세조", "1455", "1468"},
			{"예종", "1468", "1469"},
			{"성종", "1469", "1494"},
			{"연산군", "1494", "1506"},
			{"중종", "1506", "1544"},
			{"인종", "1544", "1545"},
			{"명종", "1545", "1567"},
			{"선조", "1567", "1608"},
			{"광해군", "1608", "1623"},
			{"인조", "1623", "1649"},
			{"효종", "1649", "1659"},
			{"현종", "1659", "1674"},
			{"숙종", "1674", "1720"},
			{"경종", "1720", "1724"},
			{"영조", "1724", "1776"},
			{"정조", "1776", "1800"},
			{"순조", "1800", "1834"},
			{"현종", "1834", "1849"},
			{"철종", "1849", "1863"},
			{"고종", "1863", "1897"},
	};
}
