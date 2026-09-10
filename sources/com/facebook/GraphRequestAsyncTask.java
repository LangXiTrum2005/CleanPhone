package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/GraphRequestAsyncTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/facebook/GraphResponse;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public class GraphRequestAsyncTask extends AsyncTask<Void, Void, List<? extends GraphResponse>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Exception f15947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GraphRequestBatch f15948b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/GraphRequestAsyncTask$Companion;", "", "", "TAG", "Ljava/lang/String;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    public GraphRequestAsyncTask(GraphRequestBatch requests) {
        Intrinsics.f(requests, "requests");
        this.f15948b = requests;
    }

    @Override // android.os.AsyncTask
    public final List<? extends GraphResponse> doInBackground(Void[] voidArr) {
        if (!CrashShieldHandler.b(this)) {
            try {
                Void[] params = voidArr;
                if (!CrashShieldHandler.b(this)) {
                    try {
                        Intrinsics.f(params, "params");
                        GraphRequestBatch graphRequestBatch = this.f15948b;
                        try {
                            graphRequestBatch.getClass();
                            String str = GraphRequest.j;
                            return GraphRequest.Companion.c(graphRequestBatch);
                        } catch (Exception e2) {
                            this.f15947a = e2;
                        }
                    } catch (Throwable th) {
                        CrashShieldHandler.a(this, th);
                    }
                }
            } catch (Throwable th2) {
                CrashShieldHandler.a(this, th2);
                return null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(List<? extends GraphResponse> list) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            List<? extends GraphResponse> result = list;
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                Intrinsics.f(result, "result");
                super.onPostExecute(result);
                Exception exc = this.f15947a;
                if (exc != null) {
                    String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                    HashSet hashSet = FacebookSdk.f15915a;
                    return;
                }
                return;
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
                return;
            }
            CrashShieldHandler.a(this, th);
        } catch (Throwable th2) {
            CrashShieldHandler.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        GraphRequestBatch graphRequestBatch = this.f15948b;
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            super.onPreExecute();
            HashSet hashSet = FacebookSdk.f15915a;
            if (graphRequestBatch.X == null) {
                graphRequestBatch.X = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public final String toString() {
        String str = "{RequestAsyncTask:  connection: null, requests: " + this.f15948b + "}";
        Intrinsics.e(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
