package com.startapp.simple.bloomfilter.parsing;

import com.startapp.simple.bloomfilter.data.TokenData;
import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class TokenParser {
    private static final Pattern NUMBER_PATTERN = Pattern.compile("\\d+");

    private boolean validTimestamp(String str) {
        return NUMBER_PATTERN.matcher(str).matches();
    }

    private BloomVersion versionByToken(String str) {
        if ("4".equals(str)) {
            return BloomVersion.FOUR;
        }
        if ("5".equals(str)) {
            return BloomVersion.FIVE;
        }
        return null;
    }

    public TokenData fromTokenString(String str) {
        BloomVersion bloomVersionVersionByToken;
        long j;
        String[] strArrSplit = str.split(TokenBuilder.TOKEN_DELIMITER);
        int length = strArrSplit.length;
        if (length == 1) {
            bloomVersionVersionByToken = BloomVersion.ZERO;
            j = 0;
        } else if (length == 2) {
            bloomVersionVersionByToken = BloomVersion.THREE;
            if (!validTimestamp(strArrSplit[0])) {
                return null;
            }
            j = Long.parseLong(strArrSplit[0]);
            str = strArrSplit[1];
        } else {
            if (length != 3 || !validTimestamp(strArrSplit[0])) {
                return null;
            }
            j = Long.parseLong(strArrSplit[0]);
            bloomVersionVersionByToken = versionByToken(strArrSplit[1]);
            if (bloomVersionVersionByToken == null) {
                return null;
            }
            str = strArrSplit[2];
        }
        return new TokenData(bloomVersionVersionByToken, j, str);
    }
}
