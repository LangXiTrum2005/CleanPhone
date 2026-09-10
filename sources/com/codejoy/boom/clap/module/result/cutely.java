package com.codejoy.boom.clap.module.result;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ActivateResultViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/codejoy/boom/clap/module/result/cutely;", "", "<init>", "()V", "wireman", "saneness", "attabal", "dern", "Lcom/codejoy/boom/clap/module/result/cutely$attabal;", "Lcom/codejoy/boom/clap/module/result/cutely$saneness;", "Lcom/codejoy/boom/clap/module/result/cutely$dern;", "Lcom/codejoy/boom/clap/module/result/cutely$wireman;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class cutely {

    /* JADX INFO: compiled from: ActivateResultViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/codejoy/boom/clap/module/result/cutely$attabal;", "Lcom/codejoy/boom/clap/module/result/cutely;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal extends cutely {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f18418attabal = new attabal();

        public attabal() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ActivateResultViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/codejoy/boom/clap/module/result/cutely$dern;", "Lcom/codejoy/boom/clap/module/result/cutely;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class dern extends cutely {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final dern f18419attabal = new dern();

        public dern() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.codejoy.boom.clap.module.result.cutely$saneness, reason: from toString */
    /* JADX INFO: compiled from: ActivateResultViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/codejoy/boom/clap/module/result/cutely$saneness;", "Lcom/codejoy/boom/clap/module/result/cutely;", "", "remainingSeconds", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "I", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Countdown extends cutely {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
        public final int remainingSeconds;

        public Countdown(int i) {
            super(null);
            this.remainingSeconds = i;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final int getRemainingSeconds() {
            return this.remainingSeconds;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Countdown) && this.remainingSeconds == ((Countdown) other).remainingSeconds;
        }

        public int hashCode() {
            return Integer.hashCode(this.remainingSeconds);
        }

        public String toString() {
            return "Countdown(remainingSeconds=" + this.remainingSeconds + ")";
        }
    }

    /* JADX INFO: compiled from: ActivateResultViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/codejoy/boom/clap/module/result/cutely$wireman;", "Lcom/codejoy/boom/clap/module/result/cutely;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class wireman extends cutely {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final wireman f18421attabal = new wireman();

        public wireman() {
            super(null);
        }
    }

    public /* synthetic */ cutely(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public cutely() {
    }
}
