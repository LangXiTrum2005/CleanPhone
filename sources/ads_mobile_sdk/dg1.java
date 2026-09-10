package ads_mobile_sdk;

import ads_mobile_sdk.dg1;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dg1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Long i;
    public final /* synthetic */ Long j;
    public final /* synthetic */ eg1 k;
    public final /* synthetic */ gq0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg1(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Long l2, eg1 eg1Var, gq0 gq0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = activity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = l;
        this.j = l2;
        this.k = eg1Var;
        this.l = gq0Var;
    }

    public static final void a(String str, String str2, String str3, Long l, Long l2, eg1 eg1Var, DialogInterface dialogInterface, int i) {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
        data.putExtra("title", str);
        data.putExtra("eventLocation", str2);
        data.putExtra(InMobiNetworkValues.DESCRIPTION, str3);
        if (l != null) {
            data.putExtra("beginTime", l.longValue());
        }
        if (l2 != null) {
            data.putExtra("endTime", l2.longValue());
        }
        data.setFlags(268435456);
        eg1Var.c.a(data);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new dg1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dg1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.a, R.style.Theme.Material.Dialog.Alert);
        builder.setTitle(this.b);
        builder.setMessage(this.c);
        String str = this.d;
        final String str2 = this.f;
        final String str3 = this.g;
        final String str4 = this.h;
        final Long l = this.i;
        final Long l2 = this.j;
        final eg1 eg1Var = this.k;
        builder.setPositiveButton(str, new DialogInterface.OnClickListener() { // from class: saneness.nattier
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dg1.a(str2, str3, str4, l, l2, eg1Var, dialogInterface, i);
            }
        });
        String str5 = this.e;
        final eg1 eg1Var2 = this.k;
        final gq0 gq0Var = this.l;
        builder.setNegativeButton(str5, new DialogInterface.OnClickListener() { // from class: saneness.bavaria
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dg1.a(eg1Var2, gq0Var, dialogInterface, i);
            }
        });
        builder.create().show();
        return Unit.f29295attabal;
    }

    public static final void a(eg1 eg1Var, gq0 gq0Var, DialogInterface dialogInterface, int i) {
        cutely.wireman(eg1Var.d, null, null, new cg1(eg1Var, gq0Var, "Operation denied by user.", null), 3, null);
    }
}
