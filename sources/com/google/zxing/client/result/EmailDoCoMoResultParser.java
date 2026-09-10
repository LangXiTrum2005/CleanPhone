package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class EmailDoCoMoResultParser extends AbstractDoCoMoResultParser {
    static {
        Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");
    }
}
