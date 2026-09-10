package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FragmentHostCallback.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000eJ9\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00028\u0000H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J1\u0010(\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)JS\u0010/\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020*2\u0006\u0010%\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010#2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&H\u0017¢\u0006\u0004\b/\u00100J-\u00102\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u0006\u0010%\u001a\u00020\tH\u0017¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u00107J\u0019\u0010:\u001a\u0004\u0018\u0001092\u0006\u00108\u001a\u00020\tH\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000205H\u0016¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b/\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001f\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0017\u0010O\u001a\u00020J8G¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Landroidx/fragment/app/adultoid;", "H", "Landroidx/fragment/app/polloi;", "Landroid/app/Activity;", "activity", "Landroid/content/Context;", "context", "Landroid/os/Handler;", "handler", "", "windowAnimations", "<init>", "(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "", "prefix", "Ljava/io/FileDescriptor;", "fd", "Ljava/io/PrintWriter;", "writer", "", "args", "", "taiyuan", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "apical", "()Landroid/view/LayoutInflater;", "cutely", "()Ljava/lang/Object;", "arytenoidectomy", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroid/content/Intent;", "intent", "requestCode", "Landroid/os/Bundle;", "options", "triweekly", "(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "kowloon", "(Landroidx/fragment/app/Fragment;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "permissions", "formularize", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V", "permission", "", "impassible", "(Ljava/lang/String;)Z", "id", "Landroid/view/View;", "dern", "(I)Landroid/view/View;", "wireman", "()Z", "Landroid/app/Activity;", "marial", "()Landroid/app/Activity;", "Landroid/content/Context;", "beachfront", "()Landroid/content/Context;", "monoploid", "Landroid/os/Handler;", "impromptu", "()Landroid/os/Handler;", "polloi", "I", "Landroidx/fragment/app/FragmentManager;", "molybdenite", "Landroidx/fragment/app/FragmentManager;", "competently", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class adultoid<H> extends polloi {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Context context;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Activity activity;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final FragmentManager fragmentManager;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final Handler handler;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final int windowAnimations;

    public adultoid(Activity activity, Context context, Handler handler, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.activity = activity;
        this.context = context;
        this.handler = handler;
        this.windowAnimations = i;
        this.fragmentManager = new sealless();
    }

    public LayoutInflater apical() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.context);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(context)");
        return layoutInflaterFrom;
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    public abstract H cutely();

    @Override // androidx.fragment.app.polloi
    public View dern(int id) {
        return null;
    }

    @patroclinal.wireman
    public void formularize(Fragment fragment, String[] permissions, int requestCode) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
    }

    public boolean impassible(String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return false;
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    @patroclinal.wireman
    public void kowloon(Fragment fragment, IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (requestCode != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        Activity activity = this.activity;
        if (activity == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        igbo.saneness.competently(activity, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final Activity getActivity() {
        return this.activity;
    }

    public void taiyuan(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(writer, "writer");
    }

    public void triweekly(Fragment fragment, Intent intent, int requestCode, Bundle options) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (requestCode != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        picketboat.saneness.startActivity(this.context, intent, options);
    }

    @Override // androidx.fragment.app.polloi
    public boolean wireman() {
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public adultoid(FragmentActivity activity) {
        this(activity, activity, new Handler(), 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void arytenoidectomy() {
    }
}
