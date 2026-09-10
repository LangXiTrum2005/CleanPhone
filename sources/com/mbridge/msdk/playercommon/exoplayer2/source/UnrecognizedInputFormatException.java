package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final Uri uri;

    public UnrecognizedInputFormatException(String str, Uri uri) {
        super(str);
        this.uri = uri;
    }
}
