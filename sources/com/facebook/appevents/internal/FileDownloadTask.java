package com.facebook.appevents.internal;

import android.os.AsyncTask;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00042\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/internal/FileDownloadTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "uriStr", "Ljava/io/File;", "destFile", "Lcom/facebook/appevents/internal/FileDownloadTask$Callback;", "onSuccess", "<init>", "(Ljava/lang/String;Ljava/io/File;Lcom/facebook/appevents/internal/FileDownloadTask$Callback;)V", "", "args", "doInBackground", "([Ljava/lang/String;)Ljava/lang/Boolean;", "isSuccess", "Lwj/r;", "onPostExecute", "(Z)V", "Ljava/lang/String;", "Ljava/io/File;", "Lcom/facebook/appevents/internal/FileDownloadTask$Callback;", "Callback", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class FileDownloadTask extends AsyncTask<String, Void, Boolean> {
    private final File destFile;
    private final Callback onSuccess;
    private final String uriStr;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/internal/FileDownloadTask$Callback;", "", "Ljava/io/File;", X3.i.f27782b, "Lwj/r;", "onComplete", "(Ljava/io/File;)V", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public interface Callback {
        void onComplete(File file);
    }

    public FileDownloadTask(String uriStr, File destFile, Callback onSuccess) {
        n.f(uriStr, "uriStr");
        n.f(destFile, "destFile");
        n.f(onSuccess, "onSuccess");
        this.uriStr = uriStr;
        this.destFile = destFile;
        this.onSuccess = onSuccess;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Boolean] */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            if (v7.a.b(this)) {
                return null;
            }
            try {
                this = doInBackground2(strArr);
                return this;
            } catch (Throwable th2) {
                v7.a.a(this, th2);
                return null;
            }
        } catch (Throwable th3) {
            v7.a.a(this, th3);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (v7.a.b(this)) {
                return;
            }
            try {
                onPostExecute(bool.booleanValue());
            } catch (Throwable th2) {
                v7.a.a(this, th2);
            }
        } catch (Throwable th3) {
            v7.a.a(this, th3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Boolean] */
    /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
    public Boolean doInBackground2(String... args) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            if (v7.a.b(this)) {
                return null;
            }
            try {
                n.f(args, "args");
                try {
                    URL url = new URL(this.uriStr);
                    int contentLength = url.openConnection().getContentLength();
                    DataInputStream dataInputStream = new DataInputStream(url.openStream());
                    byte[] bArr = new byte[contentLength];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.destFile));
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    this = Boolean.TRUE;
                    return this;
                } catch (Exception unused) {
                    this = Boolean.FALSE;
                    return this;
                }
            } catch (Throwable th2) {
                v7.a.a(this, th2);
                return null;
            }
        } catch (Throwable th3) {
            v7.a.a(this, th3);
            return null;
        }
    }

    public void onPostExecute(boolean isSuccess) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (!v7.a.b(this) && isSuccess) {
                try {
                    this.onSuccess.onComplete(this.destFile);
                } catch (Throwable th2) {
                    v7.a.a(this, th2);
                }
            }
        } catch (Throwable th3) {
            v7.a.a(this, th3);
        }
    }
}
