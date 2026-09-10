package com.yoadx.ad.lib.utils;

import android.content.Context;
import interaction.formularize;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;

/* JADX INFO: compiled from: AdUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yoadx/ad/lib/utils/attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "assetsFileName", "attabal", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "str", "saneness", "(Ljava/lang/String;)Ljava/lang/String;", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f23897attabal = new attabal();

    public final String attabal(Context context, String assetsFileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsFileName, "assetsFileName");
        try {
            Result.Companion companion = Result.INSTANCE;
            InputStream inputStreamOpen = context.getAssets().open(assetsFileName);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
            try {
                String strImpromptu = formularize.impromptu(bufferedReader);
                interaction.saneness.attabal(bufferedReader, null);
                return strImpromptu;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    interaction.saneness.attabal(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th3));
            return "";
        }
    }

    public final String saneness(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        if (str.length() <= 100) {
            return str;
        }
        String strSubstring = str.substring(0, 100);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
