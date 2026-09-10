package com.chartboost.sdk.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineDispatcher f14869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f14870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f14871c;
    public final long d;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14872b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final URL invoke(String it) {
            Intrinsics.f(it, "it");
            return new URL(it);
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f14873b = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke(InputStream it) {
            Intrinsics.f(it, "it");
            return BitmapFactory.decodeStream(it);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14875c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14876e;
        public final /* synthetic */ String g;

        public static final class a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f14877b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f14878c;
            public final /* synthetic */ URL d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f14879e;
            public final /* synthetic */ Ref.ObjectRef f;
            public final /* synthetic */ q2 g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.ObjectRef objectRef, URL url, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, q2 q2Var, Continuation continuation) {
                super(2, continuation);
                this.f14878c = objectRef;
                this.d = url;
                this.f14879e = objectRef2;
                this.f = objectRef3;
                this.g = q2Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f14878c, this.d, this.f14879e, this.f, this.g, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                Bitmap bitmap;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                if (this.f14877b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                Ref.ObjectRef objectRef = this.f14878c;
                URLConnection uRLConnectionOpenConnection = this.d.openConnection();
                Intrinsics.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                Ref.ObjectRef objectRef2 = this.f;
                httpsURLConnection.setDoInput(true);
                objectRef2.X = httpsURLConnection.getInputStream();
                objectRef.X = httpsURLConnection;
                Ref.ObjectRef objectRef3 = this.f14879e;
                InputStream inputStream = (InputStream) this.f.X;
                if (inputStream == null || (bitmap = (Bitmap) this.g.f14871c.invoke(inputStream)) == null) {
                    throw new IOException("Bitmap decoded to null");
                }
                objectRef3.X = bitmap;
                return Unit.f43263a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation continuation) {
            super(2, continuation);
            this.g = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return q2.this.new c(this.g, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0072  */
        /* JADX WARN: Code duplicated, block: B:32:0x008f  */
        /* JADX WARN: Code duplicated, block: B:35:0x0098 A[PHI: r3 r13
  0x0098: PHI (r3v4 kotlin.jvm.internal.Ref$ObjectRef) = (r3v3 kotlin.jvm.internal.Ref$ObjectRef), (r3v6 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:34:0x0096, B:23:0x0079] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r13v15 javax.net.ssl.HttpsURLConnection) = (r13v14 javax.net.ssl.HttpsURLConnection), (r13v20 javax.net.ssl.HttpsURLConnection) binds: [B:34:0x0096, B:23:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:44:0x00af  */
        /* JADX WARN: Code duplicated, block: B:51:? A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            Throwable th;
            Exception exc;
            Ref.ObjectRef objectRef3;
            Ref.ObjectRef objectRef4;
            Ref.ObjectRef objectRef5;
            InputStream inputStream;
            HttpsURLConnection httpsURLConnection;
            InputStream inputStream2;
            HttpsURLConnection httpsURLConnection2;
            InputStream inputStream3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f14876e;
            if (i2 == 0) {
                ResultKt.b(obj);
                Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                objectRef = new Ref.ObjectRef();
                objectRef2 = new Ref.ObjectRef();
                try {
                    URL url = (URL) q2.this.f14870b.invoke(this.g);
                    long j = q2.this.d;
                    a aVar = new a(objectRef, url, objectRef6, objectRef2, q2.this, null);
                    this.f14874b = objectRef6;
                    this.f14875c = objectRef;
                    this.d = objectRef2;
                    this.f14876e = 1;
                    if (TimeoutKt.b(j, aVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    objectRef3 = objectRef;
                    objectRef4 = objectRef6;
                    objectRef5 = objectRef2;
                    inputStream3 = (InputStream) objectRef5.X;
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    httpsURLConnection2 = (HttpsURLConnection) objectRef3.X;
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                } catch (Exception e2) {
                    exc = e2;
                    objectRef3 = objectRef;
                    objectRef4 = objectRef6;
                    objectRef5 = objectRef2;
                    za.e("Unable to download the info icon image", exc);
                    inputStream2 = (InputStream) objectRef5.X;
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    httpsURLConnection2 = (HttpsURLConnection) objectRef3.X;
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = (InputStream) objectRef2.X;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    httpsURLConnection = (HttpsURLConnection) objectRef.X;
                    if (httpsURLConnection != null) {
                        throw th;
                    }
                    httpsURLConnection.disconnect();
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef5 = (Ref.ObjectRef) this.d;
                objectRef3 = (Ref.ObjectRef) this.f14875c;
                objectRef4 = (Ref.ObjectRef) this.f14874b;
                try {
                    try {
                        ResultKt.b(obj);
                        inputStream3 = (InputStream) objectRef5.X;
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        httpsURLConnection2 = (HttpsURLConnection) objectRef3.X;
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        objectRef2 = objectRef5;
                        objectRef = objectRef3;
                        inputStream = (InputStream) objectRef2.X;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        httpsURLConnection = (HttpsURLConnection) objectRef.X;
                        if (httpsURLConnection != null) {
                            throw th;
                        }
                        httpsURLConnection.disconnect();
                        throw th;
                    }
                } catch (Exception e3) {
                    exc = e3;
                    za.e("Unable to download the info icon image", exc);
                    inputStream2 = (InputStream) objectRef5.X;
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    httpsURLConnection2 = (HttpsURLConnection) objectRef3.X;
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                }
            }
            return objectRef4.X;
        }
    }

    public q2(CoroutineDispatcher ioDispatcher, Function1 urlFactory, Function1 bitmapFactory) {
        Intrinsics.f(ioDispatcher, "ioDispatcher");
        Intrinsics.f(urlFactory, "urlFactory");
        Intrinsics.f(bitmapFactory, "bitmapFactory");
        this.f14869a = ioDispatcher;
        this.f14870b = urlFactory;
        this.f14871c = bitmapFactory;
        this.d = 1000L;
    }

    public final Object a(String str, Continuation continuation) {
        return BuildersKt.f(this.f14869a, new c(str, null), continuation);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q2(CoroutineDispatcher coroutineDispatcher, Function1 function1, Function1 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher = DefaultIoScheduler.f45062Y;
        }
        this(coroutineDispatcher, (i2 & 2) != 0 ? a.f14872b : function1, (i2 & 4) != 0 ? b.f14873b : function2);
    }
}
