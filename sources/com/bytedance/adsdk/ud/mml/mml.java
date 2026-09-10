package com.bytedance.adsdk.ud.mml;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public interface mml extends Closeable {
    String lnr();

    String mml();

    boolean qdl();

    InputStream ud() throws IOException;
}
