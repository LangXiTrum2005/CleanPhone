package com.chartboost.sdk.impl;

import A.ViewOnClickListenerC0885d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.chartboost.sdk.R;
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
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class m8 extends l4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ea f14453e;
    public final k5 f;
    public final t9 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineDispatcher f14454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q2 f14455i;
    public Job j;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14456b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m2 invoke(Context it) {
            Intrinsics.f(it, "it");
            return new m2(it);
        }
    }

    public static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t9 f14457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f14458c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t9 t9Var, Context context) {
            super(2);
            this.f14457b = t9Var;
            this.f14458c = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j5 invoke(k5 cb, y6 et) {
            Intrinsics.f(cb, "cb");
            Intrinsics.f(et, "et");
            return new n2(this.f14457b, new zf(this.f14458c), cb, et);
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14459a;

        static {
            int[] iArr = new int[ea.b.values().length];
            try {
                iArr[ea.b.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ea.b.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ea.b.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ea.b.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14459a = iArr;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14460b;
        public final /* synthetic */ ImageView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ImageView imageView, Continuation continuation) {
            super(2, continuation);
            this.d = imageView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return m8.this.new d(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f14460b;
            if (i2 == 0) {
                ResultKt.b(obj);
                q2 q2Var = m8.this.f14455i;
                String strB = m8.this.f14453e.b();
                this.f14460b = 1;
                obj = q2Var.a(strB, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                this.d.setImageBitmap(bitmap);
            }
            this.d.setVisibility(0);
            return Unit.f43263a;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(Throwable th) {
            m8.this.j = null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f43263a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(Context context, String baseUrl, String html, ea infoIcon, y6 eventTracker, k5 callback, t9 impressionInterface, CoroutineDispatcher dispatcher, Function1 cbWebViewFactory, q2 cbImageDownloader) {
        super(context, html, callback, impressionInterface, baseUrl, eventTracker, cbWebViewFactory, null, new b(impressionInterface, context), 128, null);
        Intrinsics.f(context, "context");
        Intrinsics.f(baseUrl, "baseUrl");
        Intrinsics.f(html, "html");
        Intrinsics.f(infoIcon, "infoIcon");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(callback, "callback");
        Intrinsics.f(impressionInterface, "impressionInterface");
        Intrinsics.f(dispatcher, "dispatcher");
        Intrinsics.f(cbWebViewFactory, "cbWebViewFactory");
        Intrinsics.f(cbImageDownloader, "cbImageDownloader");
        this.f14453e = infoIcon;
        this.f = callback;
        this.g = impressionInterface;
        this.f14454h = dispatcher;
        this.f14455i = cbImageDownloader;
        addView(getWebViewContainer());
        callback.a();
        callback.d();
    }

    @Override // com.chartboost.sdk.impl.ij
    public void a() {
        Job job = this.j;
        if (job != null) {
            job.a(null);
        }
        this.j = null;
        super.a();
    }

    public final int a(double d2) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            d2 *= (double) displayMetrics.density;
        }
        return MathKt.a(d2);
    }

    public final void a(RelativeLayout container) {
        Intrinsics.f(container, "container");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a(this.f14453e.e().b()), a(this.f14453e.e().a()));
        int i2 = c.f14459a[this.f14453e.d().ordinal()];
        if (i2 == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i2 == 2) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else if (i2 == 3) {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        } else if (i2 == 4) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        }
        layoutParams.setMargins(a(this.f14453e.c().b()), a(this.f14453e.c().a()), a(this.f14453e.c().b()), a(this.f14453e.c().a()));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.cb_info_icon);
        imageView.setOnClickListener(new ViewOnClickListenerC0885d(this, 24));
        imageView.setVisibility(8);
        Job jobC = BuildersKt.c(CoroutineScopeKt.a(this.f14454h), null, null, new d(imageView, null), 3);
        ((JobSupport) jobC).s(new e());
        this.j = jobC;
        container.addView(imageView, layoutParams);
        this.f.a(imageView);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m8(Context context, String str, String str2, ea eaVar, y6 y6Var, k5 k5Var, t9 t9Var, CoroutineDispatcher coroutineDispatcher, Function1 function1, q2 q2Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        CoroutineDispatcher coroutineDispatcher2;
        if ((i2 & 128) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher2 = MainDispatcherLoader.f45042a;
        } else {
            coroutineDispatcher2 = coroutineDispatcher;
        }
        this(context, str, str2, eaVar, y6Var, k5Var, t9Var, coroutineDispatcher2, (i2 & 256) != 0 ? a.f14456b : function1, (i2 & 512) != 0 ? new q2(null, null, null, 7, null) : q2Var);
    }

    public static final void a(m8 this$0, View view) {
        Intrinsics.f(this$0, "this$0");
        this$0.g.a(new f3(this$0.f14453e.a(), Boolean.FALSE));
    }
}
