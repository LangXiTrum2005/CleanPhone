package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.ironsource.bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3446bg {
    public static void a(Context context, String str) throws Exception {
        a(context, str, null);
    }

    public static void a(Context context, String str, String str2) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception("url is null");
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (!TextUtils.isEmpty(str2)) {
            intent.setPackage(str2);
        }
        context.startActivity(intent);
    }
}
