class MicroBlog{
public String truncate(String input){
int len = input.codePointCount(0, input.length());
if(len == input.length()){
	if(len<=5)return input.substring(0,len);
	return input.substring(0,5);
}
else{
		StringBuilder builder = new StringBuilder();
    if(len>5)len=5;
		for(int i = 0; i < len; i++) {
			StringBuilder sb = new StringBuilder().appendCodePoint(input.codePointAt(input.offsetByCodePoints(0, i)));
			builder.append(sb);
		}
		return builder.toString();
}
    }
}
