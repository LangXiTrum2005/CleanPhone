package com.mbridge.msdk.dycreator.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile f f33290b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.engine.b f33291a;

    private f(Context context) {
        this.f33291a = null;
        com.mbridge.msdk.dycreator.engine.b bVarA = com.mbridge.msdk.dycreator.engine.b.a();
        this.f33291a = bVarA;
        bVarA.a(context, "");
    }

    public static f a(Context context) {
        if (f33290b == null) {
            synchronized (f.class) {
                try {
                    if (f33290b == null) {
                        f33290b = new f(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33290b;
    }

    public View a(String str) {
        if (new File(str).exists()) {
            return this.f33291a.e(str);
        }
        return null;
    }

    public View a(ViewGroup viewGroup, String str) {
        if (viewGroup != null && !TextUtils.isEmpty(str)) {
            if (viewGroup.getId() == str.hashCode()) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getId() == str.hashCode()) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, str);
                }
            }
        }
        return null;
    }
}
