package com.google.android.exoplayer2.extractor.mp4;

import com.google.common.base.Splitter;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
final class SefReader {
    public static final Splitter d = Splitter.a(AbstractJsonLexerKt.COLON);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Splitter f17823e = Splitter.a('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17824a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17825b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17826c;

    public static final class DataReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17828b;

        public DataReference(long j, int i2) {
            this.f17827a = j;
            this.f17828b = i2;
        }
    }
}
