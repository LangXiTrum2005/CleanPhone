package com.startapp.sdk.adsbase.crashreport;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.sdk.internal.InterfaceC3393d;
import com.startapp.sdk.internal.ci;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.vi;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements InterfaceC3393d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40650c;
    public final boolean d;

    public a(Context context, boolean z2, boolean z3, boolean z4) {
        this.f40648a = context;
        this.f40649b = z2;
        this.f40650c = z3;
        this.d = z4;
    }

    @Override // com.startapp.sdk.internal.InterfaceC3393d
    public final boolean a(String str, long j) {
        HashSet hashSet;
        ci ciVar = new ci();
        ciVar.f40882a = "com.startapp.";
        ciVar.f40885e = this.f40649b;
        ciVar.f = this.f40650c;
        ciVar.d = j;
        ciVar.f40883b = str;
        if (this.d) {
            hashSet = new HashSet();
            hashSet.add("android.webkit.WebView.loadDataWithBaseURL");
            hashSet.add("android.webkit.WebView.<init>");
            hashSet.add("android.webkit.WebView.stopLoading");
            hashSet.add("android.webkit.WebView.loadUrl");
            hashSet.add("libcore.icu.LocaleData.initLocaleData");
            hashSet.add("android.os.BinderProxy.transact");
            hashSet.add("android.hardware.SystemSensorManager.registerListenerImpl");
            hashSet.add("android.hardware.SystemSensorManager.<init>");
            hashSet.add("java.lang.Thread.<init>");
            hashSet.add("android.content.ContextWrapper.checkSelfPermission");
        } else {
            hashSet = null;
        }
        ciVar.f40884c = hashSet;
        ThreadsState threadsState = new ThreadsState(ciVar);
        if (threadsState.c() == null) {
            return false;
        }
        g7.a(this.f40648a, "StartappAnrTrace", threadsState);
        return true;
    }

    @Override // com.startapp.sdk.internal.InterfaceC3393d
    public final void remove() {
        if (new File(g7.b(this.f40648a, "StartappAnrTrace")).exists()) {
            Context context = this.f40648a;
            g7.a(new File(g7.b(context, "StartappAnrTrace")));
            g7.a(new File(g7.a(context, "StartappAnrTrace")));
        }
    }

    @Override // com.startapp.sdk.internal.InterfaceC3393d
    public final void a() {
        ThreadsState threadsState;
        ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr;
        StackTraceElement stackTraceElement;
        if (new File(g7.b(this.f40648a, "StartappAnrTrace")).exists() && (threadsState = (ThreadsState) g7.c(this.f40648a, "StartappAnrTrace")) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintWriter printWriter = new PrintWriter(vi.a(byteArrayOutputStream));
            printWriter.print("\"delay: ");
            printWriter.print(threadsState.a());
            printWriter.println(AbstractJsonLexerKt.STRING);
            if (!TextUtils.isEmpty(threadsState.b())) {
                printWriter.print("\"handler: ");
                printWriter.print(threadsState.b());
                printWriter.println(AbstractJsonLexerKt.STRING);
            }
            Map mapC = threadsState.c();
            if (mapC == null) {
                shrunkStackTraceElementArr = null;
            } else {
                shrunkStackTraceElementArr = null;
                for (Map.Entry entry : mapC.entrySet()) {
                    if (shrunkStackTraceElementArr == null) {
                        shrunkStackTraceElementArr = (ThreadsState.ShrunkStackTraceElement[]) entry.getValue();
                    }
                    String str = (String) entry.getKey();
                    ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr2 = (ThreadsState.ShrunkStackTraceElement[]) entry.getValue();
                    printWriter.print(AbstractJsonLexerKt.STRING);
                    printWriter.print(str);
                    printWriter.println(AbstractJsonLexerKt.STRING);
                    for (ThreadsState.ShrunkStackTraceElement shrunkStackTraceElement : shrunkStackTraceElementArr2) {
                        if (shrunkStackTraceElement.a() != 0) {
                            printWriter.print('\t');
                            printWriter.println(shrunkStackTraceElement.a());
                        }
                        StackTraceElement stackTraceElementB = shrunkStackTraceElement.b();
                        if (stackTraceElementB != null) {
                            printWriter.print('\t');
                            printWriter.print("at ");
                            printWriter.print(stackTraceElementB.getClassName());
                            printWriter.print('.');
                            printWriter.print(stackTraceElementB.getMethodName());
                            printWriter.print('(');
                            printWriter.print(stackTraceElementB.getFileName());
                            printWriter.print(AbstractJsonLexerKt.COLON);
                            printWriter.print(stackTraceElementB.getLineNumber());
                            printWriter.println(')');
                        }
                    }
                }
            }
            printWriter.close();
            if (shrunkStackTraceElementArr == null) {
                return;
            }
            int length = shrunkStackTraceElementArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    stackTraceElement = null;
                    break;
                }
                StackTraceElement stackTraceElementB2 = shrunkStackTraceElementArr[i2].b();
                if (stackTraceElementB2 != null && stackTraceElementB2.getClassName().startsWith("com.startapp.")) {
                    stackTraceElement = stackTraceElementB2;
                    break;
                }
                i2++;
            }
            if (stackTraceElement == null) {
                return;
            }
            String string = byteArrayOutputStream.toString();
            g9 g9Var = new g9(h9.f41041h);
            g9Var.d = stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName();
            g9Var.f41002e = string;
            g9Var.a();
        }
    }
}
