package ads_mobile_sdk;

import ads_mobile_sdk.yh1;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class yh1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ bi1 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ gq0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh1(Activity activity, String str, String str2, String str3, String str4, bi1 bi1Var, String str5, String str6, String str7, gq0 gq0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = activity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = bi1Var;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = gq0Var;
    }

    public static final void a(bi1 bi1Var, String str, String str2, String str3, Activity activity, gq0 gq0Var, DialogInterface dialogInterface, int i) {
        cutely.wireman(bi1Var.d, null, null, new ai1(bi1Var, str, gq0Var, str2, str3, activity, null), 3, null);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new yh1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((yh1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        AlertDialog.Builder message = new AlertDialog.Builder(this.a, R.style.Theme.Material.Dialog.Alert).setTitle(this.b).setMessage(this.c);
        String str = this.d;
        final bi1 bi1Var = this.f;
        final String str2 = this.g;
        final String str3 = this.h;
        final String str4 = this.i;
        final Activity activity = this.a;
        final gq0 gq0Var = this.j;
        AlertDialog.Builder positiveButton = message.setPositiveButton(str, new DialogInterface.OnClickListener() { // from class: saneness.conceal
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                yh1.a(bi1Var, str2, str3, str4, activity, gq0Var, dialogInterface, i);
            }
        });
        String str5 = this.e;
        final bi1 bi1Var2 = this.f;
        final gq0 gq0Var2 = this.j;
        positiveButton.setNegativeButton(str5, new DialogInterface.OnClickListener() { // from class: saneness.rs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                yh1.a(bi1Var2, gq0Var2, dialogInterface, i);
            }
        }).create().show();
        return Unit.f29295attabal;
    }

    public static final void a(bi1 bi1Var, gq0 gq0Var, DialogInterface dialogInterface, int i) {
        Regex regex = bi1.i;
        bi1Var.a("User canceled the download.", gq0Var, false);
    }
}
