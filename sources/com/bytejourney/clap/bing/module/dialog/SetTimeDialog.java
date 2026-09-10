package com.bytejourney.clap.bing.module.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import com.bytejourney.clap.bing.module.dialog.SetTimeDialog;
import com.codejoy.boom.clap.arytenoidectomy;
import com.codejoy.boom.clap.monoploid;
import com.codejoy.boom.clap.widget.NumberPickerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.MBridgeConstans;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.dern;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import p002kotlin.text.StringsKt;
import patroclinal.taiyuan;
import sonnetize.dovishness;

/* JADX INFO: compiled from: SetTimeDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R$\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/bytejourney/clap/bing/module/dialog/SetTimeDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lkotlin/Function1;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "arytenoidectomy", "(Lkotlin/jvm/functions/Function1;)V", "kowloon", "Lpatroclinal/taiyuan;", "taiyuan", "()Ljava/lang/String;", "time", "", "cutely", "()Z", "isStart", "Lsonnetize/dovishness;", "monoploid", "Lsonnetize/dovishness;", "binding", "", "polloi", "I", "hourValue", "molybdenite", "minuteValue", "graveside", "Lkotlin/jvm/functions/Function1;", "callback", "adultoid", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SetTimeDialog extends DialogFragment {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final int f18177dovishness = 8;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public Function1<? super String, Unit> callback;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public int minuteValue;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public dovishness binding;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public int hourValue;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final taiyuan time = saneness.saneness(new Function0() { // from class: cinefilm.attabal
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SetTimeDialog.monoploid(this.f15612kowloon);
        }
    });

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final taiyuan isStart = saneness.saneness(new Function0() { // from class: cinefilm.saneness
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(SetTimeDialog.apical(this.f15616kowloon));
        }
    });

    /* JADX INFO: renamed from: com.bytejourney.clap.bing.module.dialog.SetTimeDialog$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SetTimeDialog.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bytejourney/clap/bing/module/dialog/SetTimeDialog$attabal;", "", "<init>", "()V", "", "time", "", "isStart", "Lcom/bytejourney/clap/bing/module/dialog/SetTimeDialog;", "attabal", "(Ljava/lang/String;Z)Lcom/bytejourney/clap/bing/module/dialog/SetTimeDialog;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SetTimeDialog attabal(String time, boolean isStart) {
            Intrinsics.checkNotNullParameter(time, "time");
            SetTimeDialog setTimeDialog = new SetTimeDialog();
            Bundle bundle = new Bundle();
            bundle.putString("time", time);
            bundle.putBoolean("is_start", isStart);
            setTimeDialog.setArguments(bundle);
            return setTimeDialog;
        }

        public Companion() {
        }
    }

    public static final boolean apical(SetTimeDialog setTimeDialog) {
        Bundle arguments = setTimeDialog.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("is_start");
        }
        return true;
    }

    public static final void formularize(SetTimeDialog setTimeDialog, NumberPickerView numberPickerView, int i, int i2) {
        setTimeDialog.hourValue = i2;
    }

    public static final void impassible(SetTimeDialog setTimeDialog, NumberPickerView numberPickerView, int i, int i2) {
        setTimeDialog.minuteValue = i2;
    }

    public static final void kowloon(SetTimeDialog setTimeDialog, View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(setTimeDialog.hourValue < 10 ? "0" : "");
        sb.append(setTimeDialog.hourValue);
        sb.append(":");
        sb.append(setTimeDialog.minuteValue < 10 ? "0" : "");
        sb.append(setTimeDialog.minuteValue);
        Function1<? super String, Unit> function1 = setTimeDialog.callback;
        if (function1 != null) {
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            function1.invoke(string);
        }
        setTimeDialog.dismissAllowingStateLoss();
    }

    public static final String monoploid(SetTimeDialog setTimeDialog) {
        String string;
        Bundle arguments = setTimeDialog.getArguments();
        return (arguments == null || (string = arguments.getString("time")) == null) ? "" : string;
    }

    public static final void triweekly(SetTimeDialog setTimeDialog, View view) {
        setTimeDialog.dismissAllowingStateLoss();
    }

    public final void arytenoidectomy(Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.callback = listener;
    }

    public final boolean cutely() {
        return ((Boolean) this.isStart.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, monoploid.Theme_Dialog_Dark);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        dovishness dovishnessVarDern = dovishness.dern(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(dovishnessVarDern, "inflate(...)");
        this.binding = dovishnessVarDern;
        if (dovishnessVarDern == null) {
            Intrinsics.preprohormone("binding");
            dovishnessVarDern = null;
        }
        return dovishnessVarDern.getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window != null) {
            window.setStatusBarColor(0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setGravity(80);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        try {
            Result.Companion companion = Result.INSTANCE;
            List listSplit$default = StringsKt.split$default(taiyuan(), new String[]{":"}, false, 0, 6, null);
            this.hourValue = Integer.parseInt((String) listSplit$default.get(0));
            this.minuteValue = Integer.parseInt((String) listSplit$default.get(1));
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(dern.attabal(th));
        }
        dovishness dovishnessVar = null;
        if (cutely()) {
            dovishness dovishnessVar2 = this.binding;
            if (dovishnessVar2 == null) {
                Intrinsics.preprohormone("binding");
                dovishnessVar2 = null;
            }
            dovishnessVar2.f37812taiyuan.setText(getString(arytenoidectomy.start));
        } else {
            dovishness dovishnessVar3 = this.binding;
            if (dovishnessVar3 == null) {
                Intrinsics.preprohormone("binding");
                dovishnessVar3 = null;
            }
            dovishnessVar3.f37812taiyuan.setText(getString(arytenoidectomy.end));
        }
        String[] strArr = new String[24];
        for (int i = 0; i < 24; i++) {
            strArr[i] = i < 10 ? "0" + i : String.valueOf(i);
        }
        dovishness dovishnessVar4 = this.binding;
        if (dovishnessVar4 == null) {
            Intrinsics.preprohormone("binding");
            dovishnessVar4 = null;
        }
        dovishnessVar4.f37810marial.setDisplayedValues(strArr);
        dovishness dovishnessVar5 = this.binding;
        if (dovishnessVar5 == null) {
            Intrinsics.preprohormone("binding");
            dovishnessVar5 = null;
        }
        dovishnessVar5.f37810marial.setMinValue(0);
        dovishness dovishnessVar6 = this.binding;
        if (dovishnessVar6 == null) {
            Intrinsics.preprohormone("binding");
            dovishnessVar6 = null;
        }
        dovishnessVar6.f37810marial.setMaxValue(23);
        dovishness dovishnessVar7 = this.binding;
        if (dovishnessVar7 == null) {
            Intrinsics.preprohormone("binding");
            dovishnessVar7 = null;
        }
        dovishnessVar7.f37810marial.setValue(this.hourValue);
        dovishness dovishnessVar8 = this.binding;
        if (dovishnessVar8 == null) {
            Intrinsics.preprohormone("binding");
            dovishnessVar8 = null;
        }
        dovishnessVar8.f37810marial.setOnValueChangedListener(new NumberPickerView.wireman() { // from class: cinefilm.dern
            @Override // com.codejoy.boom.clap.widget.NumberPickerView.wireman
            public final void attabal(NumberPickerView numberPickerView, int i2, int i3) {
                SetTimeDialog.formularize(this.f15614attabal, numberPickerView, i2, i3);
            }
        });
        String[] strArr2 = new String[60];
        for (int i2 = 0; i2 < 60; i2++) {
            strArr2[i2] = i2 < 10 ? "0" + i2 : String.valueOf(i2);
        }
        dovishness dovishnessVar9 = this.binding;
        if (dovishnessVar9 == null) {
            Intrinsics.preprohormone("binding");
            dovishnessVar9 = null;
        }
        dovishnessVar9.f37805beachfront.setDisplayedValues(strArr2);
        dovishness dovishnessVar10 = this.binding;
        if (dovishnessVar10 == null) {
            Intrinsics.preprohormone("binding");
            dovishnessVar10 = null;
        }
        dovishnessVar10.f37805beachfront.setMinValue(0);
        dovishness dovishnessVar11 = this.binding;
        if (dovishnessVar11 == null) {
            Intrinsics.preprohormone("binding");
            dovishnessVar11 = null;
        }
        dovishnessVar11.f37805beachfront.setMaxValue(59);
        dovishness dovishnessVar12 = this.binding;
        if (dovishnessVar12 == null) {
            Intrinsics.preprohormone("binding");
            dovishnessVar12 = null;
        }
        dovishnessVar12.f37805beachfront.setValue(this.minuteValue);
        dovishness dovishnessVar13 = this.binding;
        if (dovishnessVar13 == null) {
            Intrinsics.preprohormone("binding");
            dovishnessVar13 = null;
        }
        dovishnessVar13.f37805beachfront.setOnValueChangedListener(new NumberPickerView.wireman() { // from class: cinefilm.wireman
            @Override // com.codejoy.boom.clap.widget.NumberPickerView.wireman
            public final void attabal(NumberPickerView numberPickerView, int i3, int i4) {
                SetTimeDialog.impassible(this.f15617attabal, numberPickerView, i3, i4);
            }
        });
        dovishness dovishnessVar14 = this.binding;
        if (dovishnessVar14 == null) {
            Intrinsics.preprohormone("binding");
            dovishnessVar14 = null;
        }
        dovishnessVar14.f37811saneness.setOnClickListener(new View.OnClickListener() { // from class: cinefilm.marial
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SetTimeDialog.triweekly(this.f15615kowloon, view2);
            }
        });
        dovishness dovishnessVar15 = this.binding;
        if (dovishnessVar15 == null) {
            Intrinsics.preprohormone("binding");
        } else {
            dovishnessVar = dovishnessVar15;
        }
        dovishnessVar.f37808dern.setOnClickListener(new View.OnClickListener() { // from class: cinefilm.beachfront
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SetTimeDialog.kowloon(this.f15613kowloon, view2);
            }
        });
    }

    public final String taiyuan() {
        return (String) this.time.getValue();
    }
}
