package com.google.common.net;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class UrlEscapers {
    static {
        new PercentEscaper("-_.*", true);
        new PercentEscaper("-._~!$'()*,;&=@:+", false);
        new PercentEscaper("-._~!$'()*,;&=@:+/?", false);
    }
}
