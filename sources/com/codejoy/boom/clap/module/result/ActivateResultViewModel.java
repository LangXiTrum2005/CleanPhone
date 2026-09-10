package com.codejoy.boom.clap.module.result;

import androidx.p001lifecycle.hydrovane;
import androidx.p001lifecycle.starveling;
import com.codejoy.boom.clap.data.FunctionMode;
import com.ironsource.X3;
import kotlinx.coroutines.flow.dovishness;
import kotlinx.coroutines.flow.gintrap;
import kotlinx.coroutines.monroe;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ActivateResultViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0003R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/codejoy/boom/clap/module/result/ActivateResultViewModel;", "Landroidx/lifecycle/starveling;", "<init>", "()V", "Lcom/codejoy/boom/clap/data/FunctionMode;", X3.a.t, "", "activated", "", "countdownSeconds", "", "taiyuan", "(Lcom/codejoy/boom/clap/data/FunctionMode;ZI)V", "apical", "wireman", "formularize", "()Z", "triweekly", "impassible", "Lkotlinx/coroutines/flow/formularize;", "Lcom/codejoy/boom/clap/module/result/cutely;", "saneness", "Lkotlinx/coroutines/flow/formularize;", "_uiState", "Lkotlinx/coroutines/flow/dovishness;", "dern", "Lkotlinx/coroutines/flow/dovishness;", "impromptu", "()Lkotlinx/coroutines/flow/dovishness;", "uiState", "Lkotlinx/coroutines/monroe;", "Lkotlinx/coroutines/monroe;", "countdownJob", "marial", "I", "countdownDuration", "beachfront", "Lcom/codejoy/boom/clap/data/FunctionMode;", "functionMode", "competently", "Z", "isActivated", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActivateResultViewModel extends starveling {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public FunctionMode functionMode;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public boolean isActivated;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final dovishness<cutely> uiState;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public int countdownDuration;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.flow.formularize<cutely> _uiState;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public monroe countdownJob;

    public ActivateResultViewModel() {
        kotlinx.coroutines.flow.formularize<cutely> formularizeVarAttabal = gintrap.attabal(cutely.wireman.f18421attabal);
        this._uiState = formularizeVarAttabal;
        this.uiState = kotlinx.coroutines.flow.marial.saneness(formularizeVarAttabal);
        this.countdownDuration = 5;
        this.functionMode = FunctionMode.MODE_CLAP_FIND_PHONE;
        this.isActivated = true;
    }

    public static /* synthetic */ void cutely(ActivateResultViewModel activateResultViewModel, FunctionMode functionMode, boolean z, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 5;
        }
        activateResultViewModel.taiyuan(functionMode, z, i);
    }

    public final void apical() {
        if (formularize()) {
            triweekly();
        } else {
            impassible();
        }
    }

    public final boolean formularize() {
        if (!this.isActivated) {
            return false;
        }
        FunctionMode functionMode = this.functionMode;
        return functionMode == FunctionMode.MODE_ANTI_PICKPOCKET || functionMode == FunctionMode.MODE_NOT_TOUCH_PHONE;
    }

    public final void impassible() {
        this._uiState.setValue(this.isActivated ? cutely.attabal.f18418attabal : cutely.dern.f18419attabal);
    }

    public final dovishness<cutely> impromptu() {
        return this.uiState;
    }

    public final void taiyuan(FunctionMode mode, boolean activated, int countdownSeconds) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.functionMode = mode;
        this.isActivated = activated;
        this.countdownDuration = countdownSeconds;
    }

    public final void triweekly() {
        monroe monroeVar = this.countdownJob;
        if (monroeVar != null) {
            monroe.attabal.attabal(monroeVar, null, 1, null);
        }
        this.countdownJob = kotlinx.coroutines.cutely.wireman(hydrovane.attabal(this), null, null, new ActivateResultViewModel$startCountdown$1(this, null), 3, null);
    }

    @Override // androidx.p001lifecycle.starveling
    public void wireman() {
        super.wireman();
        monroe monroeVar = this.countdownJob;
        if (monroeVar != null) {
            monroe.attabal.attabal(monroeVar, null, 1, null);
        }
    }
}
