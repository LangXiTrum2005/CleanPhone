package com.google.zxing.client.result;

import com.p004ironsource.d9;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class VCardResultParser extends ResultParser {
    static {
        Pattern.compile("BEGIN:VCARD", 2);
        Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");
        Pattern.compile("\r\n[ \t]");
        Pattern.compile("\\\\[nN]");
        Pattern.compile("\\\\([,;\\\\])");
        Pattern.compile(d9.i.f24747b);
        Pattern.compile(";");
        Pattern.compile("(?<!\\\\);+");
        Pattern.compile(",");
        Pattern.compile("[;,]");
    }
}
