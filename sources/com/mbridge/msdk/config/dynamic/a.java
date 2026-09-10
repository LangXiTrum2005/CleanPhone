package com.mbridge.msdk.config.dynamic;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public View a(String str, ViewGroup viewGroup, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (str.startsWith("assets://")) {
            return c.a().a(str, viewGroup, aVar);
        }
        if (new File(str).exists()) {
            return c.a().a(str, viewGroup, aVar);
        }
        return null;
    }
}
