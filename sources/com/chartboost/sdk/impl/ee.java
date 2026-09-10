package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class ee implements de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f13816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f13817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f13818c;
    public final Lazy d;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i1 f13819b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i1 i1Var) {
            super(0);
            this.f13819b = i1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d8 invoke() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f13819b.getContext());
            Intrinsics.e(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
            return new d8(defaultSharedPreferences);
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ee.this.b().a();
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i1 f13821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vg f13822c;
        public final /* synthetic */ ee d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i1 i1Var, vg vgVar, ee eeVar) {
            super(0);
            this.f13821b = i1Var;
            this.f13822c = vgVar;
            this.d = eeVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final be invoke() {
            SharedPreferences sharedPreferencesI = this.f13821b.i();
            z6 z6VarA = this.f13822c.a();
            fe feVar = new fe(sharedPreferencesI, z6VarA);
            be beVar = new be(new le(feVar, z6VarA), new e8(feVar), new pe(feVar), new f8(), new g8(feVar), this.d.d(), this.d.b(), this.d.c());
            beVar.a(new qf.b());
            return beVar;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i1 f13823b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i1 i1Var) {
            super(0);
            this.f13823b = i1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hg invoke() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f13823b.getContext());
            Intrinsics.e(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
            return new hg(defaultSharedPreferences);
        }
    }

    public ee(i1 androidComponent, vg trackerComponent) {
        Intrinsics.f(androidComponent, "androidComponent");
        Intrinsics.f(trackerComponent, "trackerComponent");
        this.f13816a = LazyKt.b(new c(androidComponent, trackerComponent, this));
        this.f13817b = LazyKt.b(new d(androidComponent));
        this.f13818c = LazyKt.b(new a(androidComponent));
        this.d = LazyKt.b(new b());
    }

    @Override // com.chartboost.sdk.impl.de
    public be a() {
        return (be) this.f13816a.getX();
    }

    public d8 b() {
        return (d8) this.f13818c.getX();
    }

    public String c() {
        return (String) this.d.getX();
    }

    public hg d() {
        return (hg) this.f13817b.getX();
    }
}
