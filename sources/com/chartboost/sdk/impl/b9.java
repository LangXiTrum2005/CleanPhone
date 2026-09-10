package com.chartboost.sdk.impl;

import A.ViewOnClickListenerC0885d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes3.dex */
public final class b9 extends f2 {
    public final Context o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final URL f13497p;
    public final n4 q;
    public final tc r;
    public final Mediation s;
    public final Mutex t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f13498u;
    public Bitmap v;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13499b;
        public int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f13499b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = b9.this.a((Context) null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f13501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f13502c;
        public int d;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b9.this.new b(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0092 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x0017, B:28:0x008e, B:30:0x0092, B:32:0x0098, B:33:0x00b2, B:36:0x00bc, B:34:0x00b6), top: B:42:0x0017 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x0098 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x0017, B:28:0x008e, B:30:0x0092, B:32:0x0098, B:33:0x00b2, B:36:0x00bc, B:34:0x00b6), top: B:42:0x0017 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00b6 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x0017, B:28:0x008e, B:30:0x0092, B:32:0x0098, B:33:0x00b2, B:36:0x00bc, B:34:0x00b6), top: B:42:0x0017 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Mutex mutex;
            b9 b9Var;
            Mutex mutex2;
            Object obj2;
            b9 b9Var2;
            Object obj3;
            ImageView imageViewZ;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.d;
            try {
                if (i2 == 0) {
                    ResultKt.b(obj);
                    mutex = b9.this.t;
                    b9Var = b9.this;
                    this.f13501b = mutex;
                    this.f13502c = b9Var;
                    this.d = 1;
                    if (mutex.a(this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b9Var2 = (b9) this.f13502c;
                    mutex2 = (Mutex) this.f13501b;
                    try {
                        ResultKt.b(obj);
                        obj2 = ((Result) obj).X;
                        if (obj2 instanceof Result.Failure) {
                            b9Var2.a(fg.FAILURE);
                        } else {
                            imageViewZ = b9Var2.z();
                            if (imageViewZ == null) {
                                imageViewZ = new ImageView(b9Var2.o);
                                imageViewZ.setImageBitmap(b9Var2.y());
                                imageViewZ.setOnClickListener(new ViewOnClickListenerC0885d(b9Var2, 23));
                            }
                            b9Var2.a(imageViewZ);
                        }
                        obj3 = obj2;
                        Result result = new Result(obj3);
                        mutex2.b(null);
                        return result;
                    } catch (Throwable th) {
                        th = th;
                        mutex = mutex2;
                        mutex.b(null);
                        throw th;
                    }
                }
                b9Var = (b9) this.f13502c;
                Mutex mutex3 = (Mutex) this.f13501b;
                ResultKt.b(obj);
                mutex = mutex3;
                if (b9Var.z() == null || b9Var.y() == null) {
                    URL url = b9Var.f13497p;
                    this.f13501b = mutex;
                    this.f13502c = b9Var;
                    this.d = 2;
                    Object objA = b9Var.a(url, this);
                    if (objA != coroutineSingletons) {
                        mutex2 = mutex;
                        obj2 = objA;
                        b9Var2 = b9Var;
                        if (obj2 instanceof Result.Failure) {
                            imageViewZ = b9Var2.z();
                            if (imageViewZ == null) {
                                imageViewZ = new ImageView(b9Var2.o);
                                imageViewZ.setImageBitmap(b9Var2.y());
                                imageViewZ.setOnClickListener(new ViewOnClickListenerC0885d(b9Var2, 23));
                            }
                            b9Var2.a(imageViewZ);
                        } else {
                            b9Var2.a(fg.FAILURE);
                        }
                        obj3 = obj2;
                    }
                    return coroutineSingletons;
                }
                za.a("Image already loaded for URL: " + b9Var.f13497p + ". Skipping.", (Throwable) null, 2, (Object) null);
                obj3 = Unit.f43263a;
                mutex2 = mutex;
                Result result2 = new Result(obj3);
                mutex2.b(null);
                return result2;
            } catch (Throwable th2) {
                th = th2;
                mutex.b(null);
                throw th;
            }
        }

        public static final void a(b9 b9Var, View view) {
            List listC;
            xe xeVarI;
            n4 n4Var = b9Var.q;
            b9Var.a(n4Var != null ? n4Var.b() : null, true);
            n4 n4Var2 = b9Var.q;
            if (n4Var2 == null || (listC = n4Var2.c()) == null) {
                listC = EmptyList.X;
            }
            if (!b9Var.r().a((y3) new y3.c(listC), true) || (xeVarI = b9Var.i()) == null) {
                return;
            }
            xeVarI.f();
        }
    }

    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13504b;
        public int d;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f13504b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = b9.this.a((URL) null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f13506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13507c;
        public /* synthetic */ Object d;
        public final /* synthetic */ URL f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(URL url, Continuation continuation) {
            super(2, continuation);
            this.f = url;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = b9.this.new d(this.f, continuation);
            dVar.d = obj;
            return dVar;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:50:0x00de  */
        /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:55:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:57:0x0111  */
        /* JADX WARN: Instruction removed from duplicated block: B:50:0x00de, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:55:0x00fa, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:57:0x0111, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            b9 b9Var;
            d dVar;
            URL url;
            Throwable th;
            Object objA;
            URL url2;
            Throwable thA;
            ChartboostError unknown;
            ChartboostError chartboostError;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f13507c;
            Unit unit = Unit.f43263a;
            if (i2 == 0) {
                ResultKt.b(obj);
                b9Var = b9.this;
                URL url3 = this.f;
                try {
                    tc tcVar = b9Var.r;
                    String string = url3.toString();
                    Intrinsics.e(string, "toString(...)");
                    this.d = b9Var;
                    this.f13506b = url3;
                    this.f13507c = 1;
                    dVar = this;
                    try {
                        Object objA2 = tc.a.a(tcVar, string, null, dVar, 2, null);
                        if (objA2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        url = url3;
                        obj = objA2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dVar = this;
                    th = th;
                    objA = ResultKt.a(th);
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                url = (URL) this.f13506b;
                b9Var = (b9) this.d;
                try {
                    ResultKt.b(obj);
                    dVar = this;
                } catch (Throwable th4) {
                    th = th4;
                    dVar = this;
                    objA = ResultKt.a(th);
                }
            }
            xc xcVar = (xc) obj;
            if (!xcVar.f()) {
                Throwable thD = xcVar.d();
                if (thD != null) {
                    throw thD;
                }
                throw new IOException("Failed to download image: " + xcVar.e());
            }
            byte[] bArrB = xcVar.b();
            if (bArrB == null) {
                throw new IOException("Response body was null for URL: " + url);
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrB);
            try {
                b9Var.a(BitmapFactory.decodeStream(byteArrayInputStream));
                if (b9Var.y() == null) {
                    throw new IOException("Failed to decode image from URL: " + url);
                }
                byteArrayInputStream.close();
                objA = unit;
                url2 = dVar.f;
                thA = Result.a(objA);
                if (thA == null) {
                    return new Result(unit);
                }
                za.b("Failed to load image from URL: " + url2, thA);
                if (thA instanceof ChartboostError) {
                    chartboostError = (ChartboostError) thA;
                } else {
                    if (thA instanceof IOException) {
                        unknown = new ChartboostError.Load.AssetUnavailable(url2.toString(), "Failed to load image from URL: " + url2, thA);
                    } else {
                        unknown = new ChartboostError.Load.Unknown("Failed to load image from URL: " + url2, thA);
                    }
                    chartboostError = unknown;
                }
                return new Result(ResultKt.a(chartboostError));
                url2 = dVar.f;
                thA = Result.a(objA);
                if (thA == null) {
                    return new Result(unit);
                }
                za.b("Failed to load image from URL: " + url2, thA);
                if (thA instanceof ChartboostError) {
                    chartboostError = (ChartboostError) thA;
                } else {
                    if (thA instanceof IOException) {
                        unknown = new ChartboostError.Load.AssetUnavailable(url2.toString(), "Failed to load image from URL: " + url2, thA);
                    } else {
                        unknown = new ChartboostError.Load.Unknown("Failed to load image from URL: " + url2, thA);
                    }
                    chartboostError = unknown;
                }
                return new Result(ResultKt.a(chartboostError));
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    CloseableKt.a(byteArrayInputStream, th5);
                    throw th6;
                }
            }
            th = th2;
            th = th;
            objA = ResultKt.a(th);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(Context context, URL imageUrl, n4 n4Var, ue renderableConfig, w adMarkupConfig, tc networkClient, vg trackerComponent, jg telemetryManager, r adFormat, Mediation mediation) {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation);
        Intrinsics.f(context, "context");
        Intrinsics.f(imageUrl, "imageUrl");
        Intrinsics.f(renderableConfig, "renderableConfig");
        Intrinsics.f(adMarkupConfig, "adMarkupConfig");
        Intrinsics.f(networkClient, "networkClient");
        Intrinsics.f(trackerComponent, "trackerComponent");
        Intrinsics.f(telemetryManager, "telemetryManager");
        Intrinsics.f(adFormat, "adFormat");
        this.o = context;
        this.f13497p = imageUrl;
        this.q = n4Var;
        this.r = networkClient;
        this.s = mediation;
        this.t = MutexKt.a();
    }

    @Override // com.chartboost.sdk.impl.te
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public ImageView k() {
        if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
            return this.f13498u;
        }
        throw new IllegalStateException("nextAd() must be called from the main thread for ImageRenderable.");
    }

    public final Bitmap y() {
        return this.v;
    }

    public final ImageView z() {
        return this.f13498u;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.chartboost.sdk.impl.te
    public Object a(Context context, Continuation continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objF = aVar.f13499b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = aVar.d;
        if (i3 == 0) {
            ResultKt.b(objF);
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f45042a;
            b bVar = new b(null);
            aVar.d = 1;
            objF = BuildersKt.f(mainCoroutineDispatcher, bVar, aVar);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        return ((Result) objF).X;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(URL url, Continuation continuation) throws Throwable {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objF = cVar.f13504b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = cVar.d;
        if (i3 == 0) {
            ResultKt.b(objF);
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
            d dVar = new d(url, null);
            cVar.d = 1;
            objF = BuildersKt.f(defaultIoScheduler, dVar, cVar);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        return ((Result) objF).X;
    }

    public final void a(Bitmap bitmap) {
        this.v = bitmap;
    }

    public final void a(ImageView imageView) {
        this.f13498u = imageView;
    }

    @Override // com.chartboost.sdk.impl.te
    public void a(fg reason) {
        Intrinsics.f(reason, "reason");
        ImageView imageView = this.f13498u;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.f13498u = null;
        Bitmap bitmap = this.v;
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                bitmap = null;
            }
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.v = null;
        za.a("ImageRenderable stopped for URL: " + this.f13497p + ". Reason: " + reason + ". Resources cleaned up.", (Throwable) null, 2, (Object) null);
    }
}
