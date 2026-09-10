package com.charging.screenshow.battery.animations.themes.view.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.room.b;
import androidx.viewbinding.ViewBindings;
import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.activity.BaseAct;
import com.charging.screenshow.battery.animations.themes.databinding.DialogDownloadBinding;
import com.charging.screenshow.battery.animations.themes.download.DownloadListener;
import com.charging.screenshow.battery.animations.themes.download.DownloadManager;
import com.charging.screenshow.battery.animations.themes.utils.async.Async;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p007n.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/view/dialog/DownloadDialog;", "Lcom/charging/screenshow/battery/animations/themes/view/dialog/BaseDialog;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DownloadDialog extends BaseDialog {
    public static final /* synthetic */ int k0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final BaseAct f13329Y;
    public final ArrayList Z;
    public final String e0;
    public final String f0;
    public DialogDownloadBinding g0;
    public Function0 h0;
    public Function0 i0;
    public final AtomicInteger j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadDialog(BaseAct baseAct, ArrayList arrayList, String tag, String str, Function1 function1) {
        super(baseAct);
        Intrinsics.f(tag, "tag");
        this.f13329Y = baseAct;
        this.Z = arrayList;
        this.e0 = tag;
        this.f0 = str;
        this.j0 = new AtomicInteger(0);
        function1.invoke(this);
    }

    @Override // com.charging.screenshow.battery.animations.themes.view.dialog.BaseDialog
    public final View a() {
        View viewInflate = LayoutInflater.from(this.f13329Y).inflate(R.layout.dialog_download, (ViewGroup) null, false);
        int i2 = R.id.ivClose;
        ImageView imageView = (ImageView) ViewBindings.a(R.id.ivClose, viewInflate);
        if (imageView != null) {
            i2 = R.id.pbb;
            RoundCornerProgressBar roundCornerProgressBar = (RoundCornerProgressBar) ViewBindings.a(R.id.pbb, viewInflate);
            if (roundCornerProgressBar != null) {
                i2 = R.id.tvPercent;
                TextView textView = (TextView) ViewBindings.a(R.id.tvPercent, viewInflate);
                if (textView != null) {
                    i2 = R.id.tvTitle;
                    TextView textView2 = (TextView) ViewBindings.a(R.id.tvTitle, viewInflate);
                    if (textView2 != null) {
                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                        this.g0 = new DialogDownloadBinding(frameLayout, imageView, roundCornerProgressBar, textView, textView2);
                        Intrinsics.e(frameLayout, "getRoot(...)");
                        return frameLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.charging.screenshow.battery.animations.themes.view.dialog.BaseDialog
    public final void b() {
        super.b();
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        DialogDownloadBinding dialogDownloadBinding = this.g0;
        if (dialogDownloadBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        dialogDownloadBinding.f13169e.setText(this.f0);
        DialogDownloadBinding dialogDownloadBinding2 = this.g0;
        if (dialogDownloadBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(dialogDownloadBinding2.f13167b, new b(this, 25));
        DialogDownloadBinding dialogDownloadBinding3 = this.g0;
        if (dialogDownloadBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        dialogDownloadBinding3.f13168c.setProgress(0.0f);
        for (String str : this.Z) {
            ((DownloadManager) DownloadManager.f13236b.getX()).a(str, this.e0, new DownloadListener() { // from class: com.charging.screenshow.battery.animations.themes.view.dialog.DownloadDialog$startDownload$1
                @Override // com.charging.screenshow.battery.animations.themes.download.DownloadListener
                public final void a(String url) {
                    Intrinsics.f(url, "url");
                    DownloadDialog downloadDialog = this.f13330a;
                    if (downloadDialog.isShowing()) {
                        downloadDialog.dismiss();
                        Function0 function0 = downloadDialog.i0;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }
                }

                @Override // com.charging.screenshow.battery.animations.themes.download.DownloadListener
                public final void b(String url) {
                    Intrinsics.f(url, "url");
                    DownloadDialog downloadDialog = this.f13330a;
                    int size = downloadDialog.Z.size();
                    ArrayList arrayList = downloadDialog.Z;
                    if (size > 1 && downloadDialog.isShowing()) {
                        int size2 = 100;
                        if (downloadDialog.j0.get() < arrayList.size() - 1) {
                            size2 = (100 / arrayList.size()) + (downloadDialog.j0.get() * (100 / arrayList.size()));
                        }
                        DialogDownloadBinding dialogDownloadBinding4 = downloadDialog.g0;
                        if (dialogDownloadBinding4 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        dialogDownloadBinding4.f13168c.setProgress(size2);
                        DialogDownloadBinding dialogDownloadBinding5 = downloadDialog.g0;
                        if (dialogDownloadBinding5 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(size2);
                        sb.append('%');
                        dialogDownloadBinding5.d.setText(sb.toString());
                    }
                    downloadDialog.j0.incrementAndGet();
                    if (downloadDialog.j0.get() < arrayList.size() || !downloadDialog.isShowing()) {
                        return;
                    }
                    Async.b(400L, new a(downloadDialog, 1));
                }

                @Override // com.charging.screenshow.battery.animations.themes.download.DownloadListener
                public final void c(float f, String url) {
                    Intrinsics.f(url, "url");
                    DownloadDialog downloadDialog = this.f13330a;
                    if (downloadDialog.Z.size() == 1 && downloadDialog.isShowing()) {
                        DialogDownloadBinding dialogDownloadBinding4 = downloadDialog.g0;
                        if (dialogDownloadBinding4 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        float f2 = f * 100;
                        dialogDownloadBinding4.f13168c.setProgress(f2);
                        DialogDownloadBinding dialogDownloadBinding5 = downloadDialog.g0;
                        if (dialogDownloadBinding5 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        dialogDownloadBinding5.d.setText(android.support.v4.media.a.p(new StringBuilder(), (int) f2, '%'));
                    }
                }

                @Override // com.charging.screenshow.battery.animations.themes.download.DownloadListener
                public final void d(String url) {
                    Intrinsics.f(url, "url");
                }
            });
        }
        Async.b(200L, new a(this, 0));
    }
}
