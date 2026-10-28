class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for (int i = 0; i < strs.size(); i++) {
            int length = 0;
            length = strs.get(i).length();
            result += length + "#";
            result += strs.get(i);
        }
        System.out.println(result);
        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int counterStart = 0;
        while (counterStart < str.length()) {
            int counterEnd = str.indexOf('#', counterStart);
            int number = Integer.parseInt(str.substring(counterStart, counterEnd));
            counterStart = counterEnd + 1;
            counterEnd++;
            result.add(str.substring(counterStart, counterStart + number));
            counterStart += number;
            counterEnd += number;
        }
        return result;
    }
}
