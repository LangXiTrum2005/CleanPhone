package com.chartboost.sdk.impl;

import com.applovin.shadow.okio.Segment;
import com.chartboost.sdk.events.ChartboostError;
import com.mbridge.msdk.foundation.download.Command;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class ad implements c8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13427c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f13428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f13429b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f13431c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file, Continuation continuation) {
            super(2, continuation);
            this.f13431c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f13431c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13430b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            try {
                if (this.f13431c.exists()) {
                    if (this.f13431c.delete()) {
                        za.d("Cleaned up temporary download file: " + this.f13431c.getName(), null, 2, null);
                    } else {
                        za.e("Failed to delete temporary download file: " + this.f13431c.getName(), null, 2, null);
                    }
                }
            } catch (Exception e2) {
                za.b("Error during temporary file cleanup for " + this.f13431c.getName(), e2);
            }
            return Unit.f43263a;
        }
    }

    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f13432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f13433c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f13434e;
        public Object f;
        public /* synthetic */ Object g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f13436i;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.g = obj;
            this.f13436i |= Integer.MIN_VALUE;
            Object objA = ad.this.a(null, null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f13438c;
        public final /* synthetic */ ResponseBody d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ File f13439e;
        public final /* synthetic */ Ref.LongRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ResponseBody responseBody, File file, Ref.LongRef longRef, Continuation continuation) {
            super(2, continuation);
            this.d = responseBody;
            this.f13439e = file;
            this.f = longRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.d, this.f13439e, this.f, continuation);
            dVar.f13438c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13437b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f13438c;
            InputStream inputStreamByteStream = this.d.byteStream();
            File file = this.f13439e;
            Ref.LongRef longRef = this.f;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[Segment.SIZE];
                    while (true) {
                        int i2 = inputStreamByteStream.read(bArr);
                        if (i2 == -1) {
                            fileOutputStream.flush();
                            Unit unit = Unit.f43263a;
                            fileOutputStream.close();
                            inputStreamByteStream.close();
                            return unit;
                        }
                        JobKt.b(coroutineScope.getX());
                        fileOutputStream.write(bArr, 0, i2);
                        longRef.X += (long) i2;
                        try {
                            throw th;
                        } catch (Throwable th) {
                            CloseableKt.a(inputStreamByteStream, th);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f13440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f13441c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f13442e;
        public Object f;
        public Object g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f13443h;
        public int j;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f13443h = obj;
            this.j |= Integer.MIN_VALUE;
            Object objA = ad.this.a(null, null, 0L, 0L, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class f extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f13446c;
        public final /* synthetic */ ResponseBody d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ File f13447e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Ref.LongRef f13448h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ResponseBody responseBody, File file, long j, long j2, Ref.LongRef longRef, Continuation continuation) {
            super(2, continuation);
            this.d = responseBody;
            this.f13447e = file;
            this.f = j;
            this.g = j2;
            this.f13448h = longRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = new f(this.d, this.f13447e, this.f, this.g, this.f13448h, continuation);
            fVar.f13446c = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            long j;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13445b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f13446c;
            InputStream inputStreamByteStream = this.d.byteStream();
            File file = this.f13447e;
            long j2 = this.f;
            long j3 = this.g;
            Ref.LongRef longRef = this.f13448h;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    byte[] bArr = new byte[Segment.SIZE];
                    Ref.IntRef intRef = new Ref.IntRef();
                    long j4 = (j2 - j3) + 1;
                    do {
                        int i2 = inputStreamByteStream.read(bArr);
                        intRef.X = i2;
                        if (i2 == -1) {
                            break;
                        }
                        JobKt.b(coroutineScope.getX());
                        long j5 = longRef.X;
                        int i3 = intRef.X;
                        if (((long) i3) + j5 > j4) {
                            i3 = (int) (j4 - j5);
                        }
                        if (i3 <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i3);
                        j = longRef.X + ((long) i3);
                        longRef.X = j;
                    } while (j < j4);
                    fileOutputStream.flush();
                    Unit unit = Unit.f43263a;
                    fileOutputStream.close();
                    inputStreamByteStream.close();
                    return unit;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.a(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.a(inputStreamByteStream, th3);
                    throw th4;
                }
            }
        }
    }

    public ad(OkHttpClient okHttpClient, CoroutineDispatcher ioDispatcher) {
        Intrinsics.f(okHttpClient, "okHttpClient");
        Intrinsics.f(ioDispatcher, "ioDispatcher");
        this.f13428a = okHttpClient;
        this.f13429b = ioDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0204  */
    /* JADX WARN: Code duplicated, block: B:108:0x0232  */
    /* JADX WARN: Code duplicated, block: B:111:0x023a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0240 A[PHI: r0 r2
  0x0240: PHI (r0v32 java.lang.Object) = (r0v29 java.lang.Object), (r0v30 java.lang.Object), (r0v34 java.lang.Object) binds: [B:45:0x0127, B:112:0x023e, B:102:0x0208] A[DONT_GENERATE, DONT_INLINE]
  0x0240: PHI (r2v16 okhttp3.ResponseBody) = (r2v13 okhttp3.ResponseBody), (r2v15 okhttp3.ResponseBody), (r2v19 okhttp3.ResponseBody) binds: [B:45:0x0127, B:112:0x023e, B:102:0x0208] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x017d A[Catch: all -> 0x012f, TryCatch #10 {all -> 0x012f, blocks: (B:42:0x00fc, B:75:0x0179, B:77:0x017d, B:82:0x019a, B:78:0x0191, B:105:0x020d, B:34:0x00d2, B:36:0x00d8, B:38:0x00de, B:61:0x013e, B:62:0x014f, B:63:0x0150, B:64:0x0167), top: B:120:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0191 A[Catch: all -> 0x012f, TryCatch #10 {all -> 0x012f, blocks: (B:42:0x00fc, B:75:0x0179, B:77:0x017d, B:82:0x019a, B:78:0x0191, B:105:0x020d, B:34:0x00d2, B:36:0x00d8, B:38:0x00de, B:61:0x013e, B:62:0x014f, B:63:0x0150, B:64:0x0167), top: B:120:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Code duplicated, block: B:80:0x0195  */
    /* JADX WARN: Code duplicated, block: B:81:0x0198  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cf A[Catch: all -> 0x004c, TryCatch #7 {all -> 0x004c, blocks: (B:16:0x0047, B:86:0x01cb, B:88:0x01cf, B:90:0x01d5, B:92:0x01e3, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:99:0x01fe, B:23:0x0060, B:109:0x0234, B:26:0x0079), top: B:120:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01d5 A[Catch: all -> 0x004c, TryCatch #7 {all -> 0x004c, blocks: (B:16:0x0047, B:86:0x01cb, B:88:0x01cf, B:90:0x01d5, B:92:0x01e3, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:99:0x01fe, B:23:0x0060, B:109:0x0234, B:26:0x0079), top: B:120:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ec A[Catch: all -> 0x004c, TryCatch #7 {all -> 0x004c, blocks: (B:16:0x0047, B:86:0x01cb, B:88:0x01cf, B:90:0x01d5, B:92:0x01e3, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:99:0x01fe, B:23:0x0060, B:109:0x0234, B:26:0x0079), top: B:120:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01fc A[Catch: all -> 0x004c, TryCatch #7 {all -> 0x004c, blocks: (B:16:0x0047, B:86:0x01cb, B:88:0x01cf, B:90:0x01d5, B:92:0x01e3, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:99:0x01fe, B:23:0x0060, B:109:0x0234, B:26:0x0079), top: B:120:0x0035 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x017d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chartboost.sdk.impl.c8
    public Object a(URL url, File file, Continuation continuation) throws Throwable {
        c cVar;
        Response response;
        ResponseBody responseBodyBody;
        Ref.LongRef longRef;
        ad adVar;
        Response responseExecute;
        ad adVar2;
        String str;
        Exception exc;
        Response response2;
        CancellationException cancellationException;
        Response response3;
        Object l2;
        ResponseBody responseBodyBody2;
        String message;
        String lowerCase;
        URL url2 = url;
        File file2 = file;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.f13436i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.f13436i = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = cVar.f13436i;
        try {
            try {
                if (i3 == 0) {
                    ResultKt.b(obj);
                    Request requestBuild = new Request.Builder().url(url2).get().build();
                    longRef = new Ref.LongRef();
                    try {
                        za.d("Starting OkHttp download for " + url2 + " to " + file2.getAbsolutePath(), null, 2, null);
                        responseExecute = this.f13428a.newCall(requestBuild).execute();
                        try {
                            if (!responseExecute.isSuccessful()) {
                                com.chartboost.sdk.internal.Networking.okhttp.a aVarB = com.chartboost.sdk.internal.Networking.okhttp.a.f15790c.b(responseExecute.code());
                                String string = url2.toString();
                                Intrinsics.e(string, "toString(...)");
                                throw n8.a(aVarB, string);
                            }
                            ResponseBody responseBodyBody3 = responseExecute.body();
                            if (responseBodyBody3 == null) {
                                throw new IOException("Response body was null for " + url2);
                            }
                            CoroutineDispatcher coroutineDispatcher = this.f13429b;
                            d dVar = new d(responseBodyBody3, file2, longRef, null);
                            cVar.f13432b = this;
                            cVar.f13433c = url2;
                            cVar.d = file2;
                            cVar.f13434e = responseExecute;
                            cVar.f = longRef;
                            cVar.f13436i = 1;
                            if (BuildersKt.f(coroutineDispatcher, dVar, cVar) != coroutineSingletons) {
                                adVar2 = this;
                                za.d("OkHttp download complete for " + url2 + " (" + longRef.X + " bytes)", null, 2, null);
                                l2 = new Long(longRef.X);
                                if (responseExecute != null) {
                                }
                                return l2;
                            }
                            return coroutineSingletons;
                        } catch (CancellationException e2) {
                            e = e2;
                            adVar = this;
                            za.e("OkHttp download cancelled for " + url2, null, 2, null);
                            cVar.f13432b = responseExecute;
                            cVar.f13433c = e;
                            cVar.d = null;
                            cVar.f13434e = null;
                            cVar.f = null;
                            cVar.f13436i = 2;
                            if (adVar.a(file2, cVar) != coroutineSingletons) {
                                cancellationException = e;
                                response3 = responseExecute;
                                l2 = ResultKt.a(cancellationException);
                                if (response3 != null) {
                                    responseBodyBody2.close();
                                }
                                return l2;
                            }
                            return coroutineSingletons;
                        } catch (Exception e3) {
                            e = e3;
                            adVar = this;
                            if (e instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                str = "HTTP " + ((com.chartboost.sdk.internal.Networking.okhttp.a) e).b();
                            } else if (e instanceof IOException) {
                                str = "Network/IO error";
                            } else {
                                str = "Unexpected error";
                            }
                            za.b("Error during OkHttp download for " + url2 + " (" + str + ")", e);
                            cVar.f13432b = responseExecute;
                            cVar.f13433c = e;
                            cVar.d = null;
                            cVar.f13434e = null;
                            cVar.f = null;
                            cVar.f13436i = 3;
                            if (adVar.a(file2, cVar) != coroutineSingletons) {
                                exc = e;
                                response2 = responseExecute;
                                if (exc instanceof IOException) {
                                    message = exc.getMessage();
                                    if (message != null) {
                                        lowerCase = message.toLowerCase(Locale.ROOT);
                                        Intrinsics.e(lowerCase, "toLowerCase(...)");
                                    } else {
                                        lowerCase = "";
                                    }
                                    if (StringsKt.l(lowerCase, "no space left", false)) {
                                        exc = ChartboostError.Load.NoStorage.INSTANCE;
                                    } else {
                                        exc = ChartboostError.Load.NoStorage.INSTANCE;
                                    }
                                }
                                l2 = ResultKt.a(exc);
                                if (response2 != null) {
                                    responseBodyBody2.close();
                                }
                                return l2;
                            }
                            return coroutineSingletons;
                        }
                    } catch (CancellationException e4) {
                        e = e4;
                        adVar = this;
                        responseExecute = null;
                    } catch (Exception e5) {
                        e = e5;
                        adVar = this;
                        responseExecute = null;
                    } catch (Throwable th) {
                        th = th;
                        response = 0;
                        if (response != 0 && (responseBodyBody = response.body()) != null) {
                            responseBodyBody.close();
                        }
                        throw th;
                    }
                } else if (i3 == 1) {
                    Ref.LongRef longRef2 = (Ref.LongRef) cVar.f;
                    Response response4 = (Response) cVar.f13434e;
                    File file3 = (File) cVar.d;
                    URL url3 = (URL) cVar.f13433c;
                    adVar = (ad) cVar.f13432b;
                    try {
                        ResultKt.b(obj);
                        longRef = longRef2;
                        url2 = url3;
                        responseExecute = response4;
                        file2 = file3;
                        adVar2 = adVar;
                        try {
                            za.d("OkHttp download complete for " + url2 + " (" + longRef.X + " bytes)", null, 2, null);
                            l2 = new Long(longRef.X);
                            if (responseExecute != null || (responseBodyBody2 = responseExecute.body()) == null) {
                                return l2;
                            }
                        } catch (CancellationException e6) {
                            e = e6;
                            adVar = adVar2;
                            za.e("OkHttp download cancelled for " + url2, null, 2, null);
                            cVar.f13432b = responseExecute;
                            cVar.f13433c = e;
                            cVar.d = null;
                            cVar.f13434e = null;
                            cVar.f = null;
                            cVar.f13436i = 2;
                            if (adVar.a(file2, cVar) != coroutineSingletons) {
                                cancellationException = e;
                                response3 = responseExecute;
                                l2 = ResultKt.a(cancellationException);
                                if (response3 != null) {
                                }
                                return l2;
                            }
                            return coroutineSingletons;
                        } catch (Exception e7) {
                            e = e7;
                            adVar = adVar2;
                            if (e instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                str = "HTTP " + ((com.chartboost.sdk.internal.Networking.okhttp.a) e).b();
                            } else if (e instanceof IOException) {
                                str = "Network/IO error";
                            } else {
                                str = "Unexpected error";
                            }
                            za.b("Error during OkHttp download for " + url2 + " (" + str + ")", e);
                            cVar.f13432b = responseExecute;
                            cVar.f13433c = e;
                            cVar.d = null;
                            cVar.f13434e = null;
                            cVar.f = null;
                            cVar.f13436i = 3;
                            if (adVar.a(file2, cVar) != coroutineSingletons) {
                                exc = e;
                                response2 = responseExecute;
                                if (exc instanceof IOException) {
                                    message = exc.getMessage();
                                    if (message != null) {
                                        lowerCase = message.toLowerCase(Locale.ROOT);
                                        Intrinsics.e(lowerCase, "toLowerCase(...)");
                                    } else {
                                        lowerCase = "";
                                    }
                                    if (StringsKt.l(lowerCase, "no space left", false)) {
                                        exc = ChartboostError.Load.NoStorage.INSTANCE;
                                    } else {
                                        exc = ChartboostError.Load.NoStorage.INSTANCE;
                                    }
                                }
                                l2 = ResultKt.a(exc);
                                if (response2 != null) {
                                }
                                return l2;
                            }
                            return coroutineSingletons;
                        }
                    } catch (CancellationException e8) {
                        e = e8;
                        url2 = url3;
                        responseExecute = response4;
                        file2 = file3;
                        za.e("OkHttp download cancelled for " + url2, null, 2, null);
                        cVar.f13432b = responseExecute;
                        cVar.f13433c = e;
                        cVar.d = null;
                        cVar.f13434e = null;
                        cVar.f = null;
                        cVar.f13436i = 2;
                        if (adVar.a(file2, cVar) != coroutineSingletons) {
                            cancellationException = e;
                            response3 = responseExecute;
                            l2 = ResultKt.a(cancellationException);
                            if (response3 != null) {
                                responseBodyBody2.close();
                            }
                            return l2;
                        }
                        return coroutineSingletons;
                    } catch (Exception e9) {
                        e = e9;
                        url2 = url3;
                        responseExecute = response4;
                        file2 = file3;
                        if (e instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                            str = "HTTP " + ((com.chartboost.sdk.internal.Networking.okhttp.a) e).b();
                        } else if (e instanceof IOException) {
                            str = "Network/IO error";
                        } else {
                            str = "Unexpected error";
                        }
                        za.b("Error during OkHttp download for " + url2 + " (" + str + ")", e);
                        cVar.f13432b = responseExecute;
                        cVar.f13433c = e;
                        cVar.d = null;
                        cVar.f13434e = null;
                        cVar.f = null;
                        cVar.f13436i = 3;
                        if (adVar.a(file2, cVar) != coroutineSingletons) {
                            exc = e;
                            response2 = responseExecute;
                            if (exc instanceof IOException) {
                                message = exc.getMessage();
                                if (message != null) {
                                    lowerCase = message.toLowerCase(Locale.ROOT);
                                    Intrinsics.e(lowerCase, "toLowerCase(...)");
                                } else {
                                    lowerCase = "";
                                }
                                if (StringsKt.l(lowerCase, "no space left", false)) {
                                    exc = ChartboostError.Load.NoStorage.INSTANCE;
                                } else {
                                    exc = ChartboostError.Load.NoStorage.INSTANCE;
                                }
                            }
                            l2 = ResultKt.a(exc);
                            if (response2 != null) {
                                responseBodyBody2.close();
                            }
                            return l2;
                        }
                        return coroutineSingletons;
                    }
                    responseBodyBody2.close();
                } else if (i3 == 2) {
                    cancellationException = (CancellationException) cVar.f13433c;
                    response3 = (Response) cVar.f13432b;
                    ResultKt.b(obj);
                    l2 = ResultKt.a(cancellationException);
                    if (response3 != null && (responseBodyBody2 = response3.body()) != null) {
                        responseBodyBody2.close();
                    }
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    exc = (Exception) cVar.f13433c;
                    response2 = (Response) cVar.f13432b;
                    ResultKt.b(obj);
                    if (exc instanceof IOException) {
                        message = exc.getMessage();
                        if (message != null) {
                            lowerCase = message.toLowerCase(Locale.ROOT);
                            Intrinsics.e(lowerCase, "toLowerCase(...)");
                        } else {
                            lowerCase = "";
                        }
                        if (StringsKt.l(lowerCase, "no space left", false) || StringsKt.l(lowerCase, "insufficient storage", false) || StringsKt.l(lowerCase, "disk full", false)) {
                            exc = ChartboostError.Load.NoStorage.INSTANCE;
                        }
                    }
                    l2 = ResultKt.a(exc);
                    if (response2 != null && (responseBodyBody2 = response2.body()) != null) {
                        responseBodyBody2.close();
                    }
                }
                return l2;
            } catch (Throwable th2) {
                th = th2;
                response = "Starting OkHttp download for ";
            }
        } catch (Throwable th3) {
            th = th3;
            response = file2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02a8 A[Catch: all -> 0x0214, TryCatch #13 {all -> 0x0214, blocks: (B:70:0x01d8, B:72:0x01e6, B:74:0x01f6, B:117:0x02a4, B:119:0x02a8, B:124:0x02c7, B:120:0x02be, B:149:0x0342, B:47:0x014b, B:49:0x0151, B:53:0x015c, B:54:0x0180, B:59:0x0197, B:61:0x019d, B:63:0x01b8, B:64:0x01bb, B:66:0x01c1, B:99:0x0243, B:100:0x0254, B:103:0x0257, B:104:0x0278), top: B:172:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:120:0x02be A[Catch: all -> 0x0214, TryCatch #13 {all -> 0x0214, blocks: (B:70:0x01d8, B:72:0x01e6, B:74:0x01f6, B:117:0x02a4, B:119:0x02a8, B:124:0x02c7, B:120:0x02be, B:149:0x0342, B:47:0x014b, B:49:0x0151, B:53:0x015c, B:54:0x0180, B:59:0x0197, B:61:0x019d, B:63:0x01b8, B:64:0x01bb, B:66:0x01c1, B:99:0x0243, B:100:0x0254, B:103:0x0257, B:104:0x0278), top: B:172:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:130:0x02fe A[Catch: all -> 0x005b, TryCatch #16 {all -> 0x005b, blocks: (B:17:0x0056, B:128:0x02fa, B:130:0x02fe, B:132:0x0304, B:134:0x0312, B:136:0x031b, B:138:0x0323, B:140:0x032b, B:141:0x032d, B:24:0x006f, B:153:0x036c), top: B:173:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0304 A[Catch: all -> 0x005b, TryCatch #16 {all -> 0x005b, blocks: (B:17:0x0056, B:128:0x02fa, B:130:0x02fe, B:132:0x0304, B:134:0x0312, B:136:0x031b, B:138:0x0323, B:140:0x032b, B:141:0x032d, B:24:0x006f, B:153:0x036c), top: B:173:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0310  */
    /* JADX WARN: Code duplicated, block: B:136:0x031b A[Catch: all -> 0x005b, TryCatch #16 {all -> 0x005b, blocks: (B:17:0x0056, B:128:0x02fa, B:130:0x02fe, B:132:0x0304, B:134:0x0312, B:136:0x031b, B:138:0x0323, B:140:0x032b, B:141:0x032d, B:24:0x006f, B:153:0x036c), top: B:173:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x032b A[Catch: all -> 0x005b, TryCatch #16 {all -> 0x005b, blocks: (B:17:0x0056, B:128:0x02fa, B:130:0x02fe, B:132:0x0304, B:134:0x0312, B:136:0x031b, B:138:0x0323, B:140:0x032b, B:141:0x032d, B:24:0x006f, B:153:0x036c), top: B:173:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0333  */
    /* JADX WARN: Code duplicated, block: B:152:0x036b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0372  */
    /* JADX WARN: Code duplicated, block: B:157:0x0378 A[PHI: r0 r2
  0x0378: PHI (r0v50 java.lang.Object) = (r0v46 java.lang.Object), (r0v48 java.lang.Object), (r0v53 java.lang.Object) binds: [B:77:0x020f, B:156:0x0376, B:144:0x0337] A[DONT_GENERATE, DONT_INLINE]
  0x0378: PHI (r2v20 okhttp3.ResponseBody) = (r2v17 okhttp3.ResponseBody), (r2v19 okhttp3.ResponseBody), (r2v22 okhttp3.ResponseBody) binds: [B:77:0x020f, B:156:0x0376, B:144:0x0337] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    /* JADX WARN: Instruction removed from duplicated block: B:119:0x02a8, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v13, types: [com.chartboost.sdk.impl.ad$e, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v14, types: [com.chartboost.sdk.impl.ad$e, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v15, types: [com.chartboost.sdk.impl.ad$e, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r2v21, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12, types: [com.chartboost.sdk.impl.ad] */
    /* JADX WARN: Type inference failed for: r7v13, types: [com.chartboost.sdk.impl.ad] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16, types: [com.chartboost.sdk.impl.ad] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.chartboost.sdk.impl.c8
    public Object a(URL url, File file, long j, long j2, Continuation continuation) throws Throwable {
        e eVar;
        ?? Execute;
        ResponseBody responseBodyBody;
        ?? r7;
        Object obj;
        Object obj2;
        String str;
        Ref.LongRef longRef;
        ?? r2;
        ?? r12;
        String str2;
        ?? r3;
        Object l2;
        ResponseBody responseBodyBody2;
        String message;
        String lowerCase;
        URL url2 = url;
        ?? r14 = "HTTP ";
        String str3 = "Server doesn't support range requests for ";
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.j = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj3 = eVar.f13443h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = eVar.j;
        ?? r31 = coroutineSingletons;
        ?? r11 = " (";
        r31 = ")";
        try {
            if (i3 == 0) {
                ResultKt.b(obj3);
                int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i4 < 0) {
                    return ResultKt.a(new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.i(j, "startByte must be non-negative, got: ")));
                }
                if (j2 < j) {
                    return ResultKt.a(new IllegalArgumentException(android.support.v4.media.a.j(j, ")", android.support.v4.media.a.v(j2, "endByte (", ") must be >= startByte ("))));
                }
                int i5 = i4;
                StringBuilder sbV = android.support.v4.media.a.v(j, "bytes=", TokenBuilder.TOKEN_DELIMITER);
                sbV.append(j2);
                String string = sbV.toString();
                Request requestBuild = new Request.Builder().url(url2).header(Command.HTTP_HEADER_RANGE, string).get().build();
                e eVar2 = eVar;
                Ref.LongRef longRef2 = new Ref.LongRef();
                try {
                    try {
                        try {
                            za.d("Starting OkHttp partial download for " + url2 + " (" + string + ") to " + file.getAbsolutePath(), null, 2, null);
                            Execute = this.f13428a.newCall(requestBuild).execute();
                            try {
                                try {
                                    file = Execute.isSuccessful();
                                    try {
                                        try {
                                            if (file != 0) {
                                                if (Execute.code() != 206 && i5 > 0) {
                                                    za.e("Server doesn't support range requests for " + url2 + ", got HTTP " + Execute.code(), null, 2, null);
                                                    throw new IOException("Server doesn't support range requests for partial download");
                                                }
                                                ResponseBody responseBodyBody3 = Execute.body();
                                                if (responseBodyBody3 != null) {
                                                    CoroutineDispatcher coroutineDispatcher = this.f13429b;
                                                    r31 = r31;
                                                    obj = ")";
                                                    obj2 = " (";
                                                    Object obj4 = "HTTP ";
                                                    r14 = eVar2;
                                                    ?? r5 = file;
                                                    try {
                                                        f fVar = new f(responseBodyBody3, r5, j2, j, longRef2, null);
                                                        try {
                                                            r14.f13440b = this;
                                                            r14.f13441c = url2;
                                                            r5 = file;
                                                            r14.d = r5;
                                                            r14.f13442e = string;
                                                            r14.f = Execute;
                                                            r14.g = longRef2;
                                                            r14.j = 1;
                                                            r12 = r31;
                                                            if (BuildersKt.f(coroutineDispatcher, fVar, r14) != r31) {
                                                                str = string;
                                                                r7 = this;
                                                                longRef = longRef2;
                                                                file = r5;
                                                                r31 = r31;
                                                                Execute = Execute;
                                                                r14 = r14;
                                                                r14 = obj4;
                                                                long j3 = longRef.X;
                                                                ?? sb = new StringBuilder("OkHttp partial download complete for ");
                                                                sb.append(url2);
                                                                r11 = obj2;
                                                                sb.append(r11);
                                                                sb.append(j3);
                                                                sb.append(" bytes, range: ");
                                                                sb.append(str);
                                                                r31 = obj;
                                                                sb.append(r31);
                                                                za.d(sb.toString(), null, 2, null);
                                                                l2 = new Long(longRef.X);
                                                                if (Execute != 0) {
                                                                }
                                                                return l2;
                                                            }
                                                        } catch (CancellationException e2) {
                                                            e = e2;
                                                            file = file;
                                                            r7 = this;
                                                            za.e("OkHttp partial download cancelled for " + url2, null, 2, null);
                                                            r14.f13440b = Execute;
                                                            r14.f13441c = e;
                                                            r14.d = null;
                                                            r14.f13442e = null;
                                                            r14.f = null;
                                                            r14.g = null;
                                                            r14.j = 2;
                                                            r12 = r31;
                                                            if (r7.a(file, r14) != r31) {
                                                                r2 = Execute;
                                                                l2 = ResultKt.a(e);
                                                                if (r2 != 0) {
                                                                    responseBodyBody2.close();
                                                                }
                                                                return l2;
                                                            }
                                                            return r12;
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            r5 = file;
                                                            r31 = obj;
                                                            r11 = obj2;
                                                            file = r5;
                                                            r31 = r31;
                                                            r14 = r14;
                                                            r14 = obj4;
                                                            r7 = this;
                                                            if (e instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                                                str2 = ((String) r14) + ((com.chartboost.sdk.internal.Networking.okhttp.a) e).b();
                                                            } else if (e instanceof IOException) {
                                                                str2 = "Network/IO error";
                                                            } else {
                                                                str2 = "Unexpected error";
                                                            }
                                                            za.b("Error during OkHttp partial download for " + url2 + r11 + str2 + r31, e);
                                                            r14.f13440b = Execute;
                                                            r14.f13441c = e;
                                                            r14.d = null;
                                                            r14.f13442e = null;
                                                            r14.f = null;
                                                            r14.g = null;
                                                            r14.j = 3;
                                                            r12 = r31;
                                                            if (r7.a(file, r14) != r31) {
                                                                r3 = Execute;
                                                                if (e instanceof IOException) {
                                                                    message = e.getMessage();
                                                                    if (message != null) {
                                                                        lowerCase = message.toLowerCase(Locale.ROOT);
                                                                        Intrinsics.e(lowerCase, "toLowerCase(...)");
                                                                    } else {
                                                                        lowerCase = "";
                                                                    }
                                                                    if (!StringsKt.l(lowerCase, "no space left", false)) {
                                                                        e = ChartboostError.Load.NoStorage.INSTANCE;
                                                                    } else {
                                                                        e = ChartboostError.Load.NoStorage.INSTANCE;
                                                                    }
                                                                }
                                                                l2 = ResultKt.a(e);
                                                                if (r3 != 0) {
                                                                    responseBodyBody2.close();
                                                                }
                                                                return l2;
                                                            }
                                                            return r12;
                                                        }
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                    }
                                                    return r12;
                                                }
                                                throw new IOException("Response body was null for " + url2);
                                            }
                                            com.chartboost.sdk.internal.Networking.okhttp.a aVarB = com.chartboost.sdk.internal.Networking.okhttp.a.f15790c.b(Execute.code());
                                            String string2 = url2.toString();
                                            Intrinsics.e(string2, "toString(...)");
                                            throw n8.a(aVarB, string2);
                                        } catch (CancellationException e5) {
                                            e = e5;
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                        r31 = str3;
                                        file = file;
                                        r11 = requestBuild;
                                        r31 = r31;
                                        r14 = r14;
                                        r14 = i5;
                                    }
                                } catch (CancellationException e7) {
                                    e = e7;
                                    file = file;
                                    r31 = r31;
                                    r14 = eVar2;
                                } catch (Exception e8) {
                                    e = e8;
                                    file = file;
                                    r11 = " (";
                                    r31 = ")";
                                    r14 = "HTTP ";
                                    r14 = eVar2;
                                    r31 = r31;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (Execute != 0 && (responseBodyBody = Execute.body()) != null) {
                                    responseBodyBody.close();
                                }
                                throw th;
                            }
                        } catch (CancellationException e9) {
                            e = e9;
                            r14 = eVar2;
                            r7 = this;
                            Execute = 0;
                            za.e("OkHttp partial download cancelled for " + url2, null, 2, null);
                            r14.f13440b = Execute;
                            r14.f13441c = e;
                            r14.d = null;
                            r14.f13442e = null;
                            r14.f = null;
                            r14.g = null;
                            r14.j = 2;
                            r12 = r31;
                            if (r7.a(file, r14) != r31) {
                                r2 = Execute;
                                l2 = ResultKt.a(e);
                                if (r2 != 0) {
                                    responseBodyBody2.close();
                                }
                                return l2;
                            }
                            return r12;
                        } catch (Exception e10) {
                            e = e10;
                            r14 = eVar2;
                            r7 = this;
                            Execute = 0;
                            if (e instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                str2 = ((String) r14) + ((com.chartboost.sdk.internal.Networking.okhttp.a) e).b();
                            } else if (e instanceof IOException) {
                                str2 = "Network/IO error";
                            } else {
                                str2 = "Unexpected error";
                            }
                            za.b("Error during OkHttp partial download for " + url2 + r11 + str2 + r31, e);
                            r14.f13440b = Execute;
                            r14.f13441c = e;
                            r14.d = null;
                            r14.f13442e = null;
                            r14.f = null;
                            r14.g = null;
                            r14.j = 3;
                            r12 = r31;
                            if (r7.a(file, r14) != r31) {
                                r3 = Execute;
                                if (e instanceof IOException) {
                                    message = e.getMessage();
                                    if (message != null) {
                                        lowerCase = message.toLowerCase(Locale.ROOT);
                                        Intrinsics.e(lowerCase, "toLowerCase(...)");
                                    } else {
                                        lowerCase = "";
                                    }
                                    if (!StringsKt.l(lowerCase, "no space left", false)) {
                                        e = ChartboostError.Load.NoStorage.INSTANCE;
                                    } else {
                                        e = ChartboostError.Load.NoStorage.INSTANCE;
                                    }
                                }
                                l2 = ResultKt.a(e);
                                if (r3 != 0) {
                                    responseBodyBody2.close();
                                }
                                return l2;
                            }
                            return r12;
                        }
                    } catch (CancellationException e11) {
                        e = e11;
                        r14 = eVar2;
                    } catch (Exception e12) {
                        e = e12;
                        r14 = eVar2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Execute = 0;
                }
            } else if (i3 == 1) {
                longRef = (Ref.LongRef) eVar.g;
                Response response = (Response) eVar.f;
                str = (String) eVar.f13442e;
                file = (File) eVar.d;
                URL url3 = (URL) eVar.f13441c;
                r7 = (ad) eVar.f13440b;
                try {
                    ResultKt.b(obj3);
                    r31 = r31;
                    obj = ")";
                    Execute = response;
                    url2 = url3;
                    obj2 = " (";
                    r14 = "HTTP ";
                    r14 = eVar;
                    file = file;
                    r7 = r7;
                    try {
                        try {
                            long j4 = longRef.X;
                            ?? sb2 = new StringBuilder("OkHttp partial download complete for ");
                            sb2.append(url2);
                            r11 = obj2;
                            try {
                                sb2.append(r11);
                                sb2.append(j4);
                                sb2.append(" bytes, range: ");
                                sb2.append(str);
                                r31 = obj;
                                try {
                                    sb2.append(r31);
                                    za.d(sb2.toString(), null, 2, null);
                                    l2 = new Long(longRef.X);
                                    if (Execute != 0 || (responseBodyBody2 = Execute.body()) == null) {
                                        return l2;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    if (e instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                        str2 = ((String) r14) + ((com.chartboost.sdk.internal.Networking.okhttp.a) e).b();
                                    } else if (e instanceof IOException) {
                                        str2 = "Network/IO error";
                                    } else {
                                        str2 = "Unexpected error";
                                    }
                                    za.b("Error during OkHttp partial download for " + url2 + r11 + str2 + r31, e);
                                    r14.f13440b = Execute;
                                    r14.f13441c = e;
                                    r14.d = null;
                                    r14.f13442e = null;
                                    r14.f = null;
                                    r14.g = null;
                                    r14.j = 3;
                                    r12 = r31;
                                    if (r7.a(file, r14) != r31) {
                                        r3 = Execute;
                                        if (e instanceof IOException) {
                                            message = e.getMessage();
                                            if (message != null) {
                                                lowerCase = message.toLowerCase(Locale.ROOT);
                                                Intrinsics.e(lowerCase, "toLowerCase(...)");
                                            } else {
                                                lowerCase = "";
                                            }
                                            if (!StringsKt.l(lowerCase, "no space left", false)) {
                                                e = ChartboostError.Load.NoStorage.INSTANCE;
                                            } else {
                                                e = ChartboostError.Load.NoStorage.INSTANCE;
                                            }
                                        }
                                        l2 = ResultKt.a(e);
                                        if (r3 != 0) {
                                        }
                                        return l2;
                                    }
                                    return r12;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                r31 = obj;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            r31 = obj;
                            r11 = obj2;
                        }
                    } catch (CancellationException e16) {
                        e = e16;
                        za.e("OkHttp partial download cancelled for " + url2, null, 2, null);
                        r14.f13440b = Execute;
                        r14.f13441c = e;
                        r14.d = null;
                        r14.f13442e = null;
                        r14.f = null;
                        r14.g = null;
                        r14.j = 2;
                        r12 = r31;
                        if (r7.a(file, r14) != r31) {
                            r2 = Execute;
                            l2 = ResultKt.a(e);
                            if (r2 != 0) {
                            }
                            return l2;
                        }
                        return r12;
                    }
                } catch (CancellationException e17) {
                    e = e17;
                    r31 = r31;
                    Execute = response;
                    url2 = url3;
                    r14 = eVar;
                    za.e("OkHttp partial download cancelled for " + url2, null, 2, null);
                    r14.f13440b = Execute;
                    r14.f13441c = e;
                    r14.d = null;
                    r14.f13442e = null;
                    r14.f = null;
                    r14.g = null;
                    r14.j = 2;
                    r12 = r31;
                    if (r7.a(file, r14) != r31) {
                        r2 = Execute;
                        l2 = ResultKt.a(e);
                        if (r2 != 0) {
                            responseBodyBody2.close();
                        }
                        return l2;
                    }
                    return r12;
                } catch (Exception e18) {
                    e = e18;
                    Execute = response;
                    url2 = url3;
                    r11 = " (";
                    r31 = ")";
                    r14 = "HTTP ";
                    r31 = r31;
                    r14 = eVar;
                    if (e instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                        str2 = ((String) r14) + ((com.chartboost.sdk.internal.Networking.okhttp.a) e).b();
                    } else if (e instanceof IOException) {
                        str2 = "Network/IO error";
                    } else {
                        str2 = "Unexpected error";
                    }
                    za.b("Error during OkHttp partial download for " + url2 + r11 + str2 + r31, e);
                    r14.f13440b = Execute;
                    r14.f13441c = e;
                    r14.d = null;
                    r14.f13442e = null;
                    r14.f = null;
                    r14.g = null;
                    r14.j = 3;
                    r12 = r31;
                    if (r7.a(file, r14) != r31) {
                        r3 = Execute;
                        if (e instanceof IOException) {
                            message = e.getMessage();
                            if (message != null) {
                                lowerCase = message.toLowerCase(Locale.ROOT);
                                Intrinsics.e(lowerCase, "toLowerCase(...)");
                            } else {
                                lowerCase = "";
                            }
                            if (!StringsKt.l(lowerCase, "no space left", false)) {
                                e = ChartboostError.Load.NoStorage.INSTANCE;
                            } else {
                                e = ChartboostError.Load.NoStorage.INSTANCE;
                            }
                        }
                        l2 = ResultKt.a(e);
                        if (r3 != 0) {
                            responseBodyBody2.close();
                        }
                        return l2;
                    }
                    return r12;
                } catch (Throwable th3) {
                    th = th3;
                    Execute = response;
                    if (Execute != 0) {
                        responseBodyBody.close();
                    }
                    throw th;
                }
                responseBodyBody2.close();
            } else if (i3 == 2) {
                e = (CancellationException) eVar.f13441c;
                Response response2 = (Response) eVar.f13440b;
                ResultKt.b(obj3);
                r2 = response2;
                l2 = ResultKt.a(e);
                if (r2 != 0 && (responseBodyBody2 = r2.body()) != null) {
                    responseBodyBody2.close();
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e = (Exception) eVar.f13441c;
                Response response3 = (Response) eVar.f13440b;
                ResultKt.b(obj3);
                r3 = response3;
                if (e instanceof IOException) {
                    message = e.getMessage();
                    if (message != null) {
                        lowerCase = message.toLowerCase(Locale.ROOT);
                        Intrinsics.e(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = "";
                    }
                    if (!StringsKt.l(lowerCase, "no space left", false) || StringsKt.l(lowerCase, "insufficient storage", false) || StringsKt.l(lowerCase, "disk full", false)) {
                        e = ChartboostError.Load.NoStorage.INSTANCE;
                    }
                }
                l2 = ResultKt.a(e);
                if (r3 != 0 && (responseBodyBody2 = r3.body()) != null) {
                    responseBodyBody2.close();
                }
            }
            return l2;
        } catch (Throwable th4) {
            th = th4;
            Execute = url2;
        }
    }

    public final Object a(File file, Continuation continuation) throws Throwable {
        Object objF = BuildersKt.f(NonCancellable.X.plus(this.f13429b), new b(file, null), continuation);
        return objF == CoroutineSingletons.X ? objF : Unit.f43263a;
    }
}
