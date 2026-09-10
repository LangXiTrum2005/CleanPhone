package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.net.URL;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
public final class sc extends d2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f15120n = new a(null);
    public static final int o = R.drawable.chartboost_monetization_default_icon_background;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f15121p = Color.parseColor("#4C6EF5");
    public static final Typeface q = Typeface.DEFAULT_BOLD;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineDispatcher f15122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q2 f15123i;
    public final ImageView j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Button f15124l;
    public Job m;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15126c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ URL f15127e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(URL url, Continuation continuation) {
            super(2, continuation);
            this.f15127e = url;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = sc.this.new b(this.f15127e, continuation);
            bVar.f15126c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f15125b;
            if (i2 == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f15126c;
                q2 q2Var = sc.this.f15123i;
                String string = this.f15127e.toString();
                Intrinsics.e(string, "toString(...)");
                this.f15126c = coroutineScope;
                this.f15125b = 1;
                obj = q2Var.a(string, this);
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
            Unit unit2 = Unit.f43263a;
            if (bitmap != null) {
                sc scVar = sc.this;
                scVar.getIconView().setImageBitmap(bitmap);
                scVar.getIconView().setVisibility(0);
                unit = unit2;
            } else {
                unit = null;
            }
            if (unit == null) {
                sc.this.getIconView().setVisibility(8);
            }
            return unit2;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(Throwable th) {
            sc.this.setAppIconDownloadJob(null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f43263a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(Context context, AttributeSet attributeSet, int i2, String persistentCtaContentDescription, String openButtonContentDescription, CoroutineDispatcher dispatcher, q2 cbImageDownloader, Function0 function0) {
        super(context, attributeSet, i2, function0);
        Intrinsics.f(context, "context");
        Intrinsics.f(persistentCtaContentDescription, "persistentCtaContentDescription");
        Intrinsics.f(openButtonContentDescription, "openButtonContentDescription");
        Intrinsics.f(dispatcher, "dispatcher");
        Intrinsics.f(cbImageDownloader, "cbImageDownloader");
        this.f = persistentCtaContentDescription;
        this.g = openButtonContentDescription;
        this.f15122h = dispatcher;
        this.f15123i = cbImageDownloader;
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, a(84)));
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setId(View.generateViewId());
        shapeableImageView.setLayoutParams(new ConstraintLayout.LayoutParams(a(48), a(48)));
        shapeableImageView.setImageResource(o);
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        shapeableImageView.setImportantForAccessibility(2);
        ShapeAppearanceModel.Builder builderF = shapeableImageView.getShapeAppearanceModel().f();
        float fA = a(12);
        CornerTreatment cornerTreatmentA = MaterialShapeUtils.a(0);
        builderF.f19434a = cornerTreatmentA;
        ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        builderF.f19435b = cornerTreatmentA;
        ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        builderF.f19436c = cornerTreatmentA;
        ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        builderF.d = cornerTreatmentA;
        ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        builderF.c(fA);
        shapeableImageView.setShapeAppearanceModel(builderF.a());
        this.j = shapeableImageView;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.f4034J = a(100);
        textView.setLayoutParams(layoutParams);
        textView.setText("App Name");
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setTypeface(q);
        textView.setGravity(16);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        this.k = textView;
        Button button = new Button(context);
        button.setId(View.generateViewId());
        button.setLayoutParams(new ConstraintLayout.LayoutParams(-2, a(44)));
        button.setText("Get");
        button.setTextSize(14.0f);
        button.setTextColor(-1);
        button.setGravity(17);
        button.setMinWidth(a(80));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(a(8));
        gradientDrawable.setColor(f15121p);
        button.setBackground(gradientDrawable);
        button.setPadding(a(16), 0, a(16), 0);
        button.setContentDescription(openButtonContentDescription);
        button.setFocusable(true);
        button.setClickable(true);
        button.setOnClickListener(new p008p.d(function0, 1));
        this.f15124l = button;
        setContentDescription(persistentCtaContentDescription);
        addView(shapeableImageView);
        addView(textView);
        addView(button);
        b();
    }

    public final void b() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.e(this);
        constraintSet.d(this.f15124l.getId(), 3);
        constraintSet.d(this.f15124l.getId(), 4);
        constraintSet.f(this.f15124l.getId(), 3, 0, 3);
        constraintSet.f(this.f15124l.getId(), 4, 0, 4);
        constraintSet.d(this.f15124l.getId(), 1);
        constraintSet.d(this.f15124l.getId(), 2);
        if (this.j.getVisibility() == 0) {
            constraintSet.d(this.j.getId(), 3);
            constraintSet.d(this.j.getId(), 4);
            constraintSet.d(this.j.getId(), 1);
            constraintSet.d(this.j.getId(), 2);
            constraintSet.f(this.j.getId(), 1, 0, 1);
            constraintSet.f(this.j.getId(), 3, 0, 3);
            constraintSet.f(this.j.getId(), 4, 0, 4);
        }
        if (this.k.getVisibility() == 0) {
            constraintSet.d(this.k.getId(), 3);
            constraintSet.d(this.k.getId(), 4);
            constraintSet.d(this.k.getId(), 1);
            constraintSet.d(this.k.getId(), 2);
            constraintSet.g(this.k.getId(), 1, this.j.getVisibility() == 0 ? this.j.getId() : 0, 2, a(12));
            constraintSet.f(this.k.getId(), 3, 0, 3);
            constraintSet.f(this.k.getId(), 4, 0, 4);
        }
        if (this.j.getVisibility() == 0 && this.k.getVisibility() == 0) {
            constraintSet.g(this.f15124l.getId(), 1, this.k.getId(), 2, a(12));
            constraintSet.f(this.f15124l.getId(), 2, 0, 2);
            constraintSet.h(this.f15124l.getId(), -2);
        } else if (this.j.getVisibility() == 8 && this.k.getVisibility() == 0) {
            constraintSet.g(this.k.getId(), 1, 0, 1, a(12));
            constraintSet.g(this.f15124l.getId(), 1, this.k.getId(), 2, a(12));
            constraintSet.f(this.f15124l.getId(), 2, 0, 2);
            constraintSet.h(this.f15124l.getId(), -2);
        } else if (this.j.getVisibility() == 8 && this.k.getVisibility() == 8) {
            constraintSet.g(this.f15124l.getId(), 1, 0, 1, a(12));
            constraintSet.g(this.f15124l.getId(), 2, 0, 2, a(12));
            constraintSet.h(this.f15124l.getId(), 0);
        }
        constraintSet.b(this);
    }

    public final Job getAppIconDownloadJob() {
        return this.m;
    }

    public final ImageView getIconView() {
        return this.j;
    }

    public final Button getOpenButton() {
        return this.f15124l;
    }

    public final TextView getTitleText() {
        return this.k;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        Job job = this.m;
        if (job != null) {
            job.a(null);
        }
        this.m = null;
        super.onViewRemoved(view);
    }

    public final void setAppIconDownloadJob(Job job) {
        this.m = job;
    }

    public final void setIcon(int i2) {
        this.j.setImageResource(i2);
        this.j.setVisibility(0);
    }

    public final void setOpenText(String str) {
        if (str == null || str.length() == 0) {
            str = "Get";
        }
        this.f15124l.setText(str);
        this.f15124l.setContentDescription(getContext().getString(R.string.open_app_custom_button_description, str, this.k.getText()));
        this.f15124l.requestLayout();
    }

    public final void setTitle(String str) {
        if (str == null || str.length() == 0) {
            this.k.setVisibility(8);
            return;
        }
        this.k.setText(str);
        this.k.setVisibility(0);
        setContentDescription(getContext().getString(R.string.persistent_cta_description, str));
        this.f15124l.setContentDescription(getContext().getString(R.string.open_app_button_description, str));
    }

    @Override // com.chartboost.sdk.impl.d2
    public void a(i5 config) {
        Intrinsics.f(config, "config");
        k1 k1VarA = config.a();
        setTitle(k1VarA != null ? k1VarA.c() : null);
        setIcon(k1VarA != null ? k1VarA.b() : null);
        setOpenText(k1VarA != null ? k1VarA.a() : null);
        b();
    }

    public final void setIcon(URL url) {
        if (url == null) {
            this.j.setVisibility(8);
            return;
        }
        Job jobC = BuildersKt.c(CoroutineScopeKt.a(this.f15122h), null, null, new b(url, null), 3);
        ((JobSupport) jobC).s(new c());
        this.m = jobC;
    }

    public static final void a(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.chartboost.sdk.impl.d2
    public void a(oj tracker, mj purpose) {
        Intrinsics.f(tracker, "tracker");
        Intrinsics.f(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.j, purpose);
        tracker.a(this.k, purpose);
        tracker.a(this.f15124l, purpose);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sc(Context context, AttributeSet attributeSet, int i2, String str, String str2, CoroutineDispatcher coroutineDispatcher, q2 q2Var, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String string;
        String string2;
        CoroutineDispatcher coroutineDispatcher2;
        attributeSet = (i3 & 2) != 0 ? null : attributeSet;
        int i4 = (i3 & 4) != 0 ? 0 : i2;
        if ((i3 & 8) != 0) {
            string = context.getString(R.string.persistent_cta_description, "App Name");
            Intrinsics.e(string, "getString(...)");
        } else {
            string = str;
        }
        if ((i3 & 16) != 0) {
            string2 = context.getString(R.string.open_app_button_description, "App Name");
            Intrinsics.e(string2, "getString(...)");
        } else {
            string2 = str2;
        }
        if ((i3 & 32) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher2 = MainDispatcherLoader.f45042a;
        } else {
            coroutineDispatcher2 = coroutineDispatcher;
        }
        this(context, attributeSet, i4, string, string2, coroutineDispatcher2, (i3 & 64) != 0 ? new q2(null, null, null, 7, null) : q2Var, (i3 & 128) != 0 ? null : function0);
    }
}
