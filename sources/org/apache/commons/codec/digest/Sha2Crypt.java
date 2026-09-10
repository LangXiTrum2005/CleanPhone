package org.apache.commons.codec.digest;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class Sha2Crypt {
    static {
        Pattern.compile("^\\$([56])\\$(rounds=(\\d+)\\$)?([\\.\\/a-zA-Z0-9]{1,16}).*");
    }
}
