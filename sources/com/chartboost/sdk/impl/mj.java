package com.chartboost.sdk.impl;

import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class mj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mj f14512c;
    public static final mj d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mj f14513e;
    public static final mj f;
    public static final mj g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mj f14514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final mj f14515i;
    public static final mj j;
    public static final mj k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final mj f14516l;
    public static final mj m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ mj[] f14517n;
    public static final /* synthetic */ EnumEntries o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FriendlyObstructionPurpose f14518b;

    static {
        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.VIDEO_CONTROLS;
        f14512c = new mj("VIDEO_CONTROLS", 0, friendlyObstructionPurpose);
        d = new mj("CLOSE_BUTTON", 1, FriendlyObstructionPurpose.CLOSE_AD);
        FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.OTHER;
        f14513e = new mj("CTA_BUTTON", 2, friendlyObstructionPurpose2);
        f = new mj("SKIP_BUTTON", 3, friendlyObstructionPurpose);
        g = new mj("INDUSTRY_ICON", 4, friendlyObstructionPurpose2);
        f14514h = new mj("COUNTDOWN_TIMER", 5, friendlyObstructionPurpose2);
        FriendlyObstructionPurpose friendlyObstructionPurpose3 = FriendlyObstructionPurpose.NOT_VISIBLE;
        f14515i = new mj("OVERLAY", 6, friendlyObstructionPurpose3);
        j = new mj("BLUR", 7, friendlyObstructionPurpose2);
        k = new mj("PROGRESS_BAR", 8, friendlyObstructionPurpose2);
        f14516l = new mj("NOT_VISIBLE", 9, friendlyObstructionPurpose3);
        m = new mj("OTHER", 10, friendlyObstructionPurpose2);
        mj[] mjVarArrA = a();
        f14517n = mjVarArrA;
        o = EnumEntriesKt.a(mjVarArrA);
    }

    public mj(String str, int i2, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        super(str, i2);
        this.f14518b = friendlyObstructionPurpose;
    }

    public static final /* synthetic */ mj[] a() {
        return new mj[]{f14512c, d, f14513e, f, g, f14514h, f14515i, j, k, f14516l, m};
    }

    public static mj valueOf(String str) {
        return (mj) Enum.valueOf(mj.class, str);
    }

    public static mj[] values() {
        return (mj[]) f14517n.clone();
    }

    public final FriendlyObstructionPurpose b() {
        return this.f14518b;
    }
}
