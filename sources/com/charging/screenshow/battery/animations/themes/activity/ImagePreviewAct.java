package com.charging.screenshow.battery.animations.themes.activity;

import android.app.WallpaperManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.adapter.ImagePagerAdapter;
import com.charging.screenshow.battery.animations.themes.databinding.ActPreviewBinding;
import com.charging.screenshow.battery.animations.themes.download.DownloadUtil;
import com.charging.screenshow.battery.animations.themes.entity.PreviewBean;
import com.charging.screenshow.battery.animations.themes.network.entity.Image;
import com.charging.screenshow.battery.animations.themes.utils.MediaUtil;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.view.dialog.DownloadDialog;
import com.charging.screenshow.battery.animations.themes.view.dialog.SetAsDialog;
import com.charging.screenshow.battery.animations.themes.vm.ImgPreviewVM;
import com.startapp.sdk.internal.F;
import es.dmoral.toasty.Toasty;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import pub.devrel.easypermissions.EasyPermissions;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ImagePreviewAct;", "Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImagePreviewAct extends BaseAct implements EasyPermissions.PermissionCallbacks {
    public static final /* synthetic */ int p0 = 0;
    public ActPreviewBinding h0;
    public final ViewModelLazy i0 = new ViewModelLazy(Reflection.f43333a.b(ImgPreviewVM.class), new Function0<ViewModelStore>() { // from class: com.charging.screenshow.battery.animations.themes.activity.ImagePreviewAct$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.X.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.charging.screenshow.battery.animations.themes.activity.ImagePreviewAct$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.X.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: com.charging.screenshow.battery.animations.themes.activity.ImagePreviewAct$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.X.getDefaultViewModelCreationExtras();
        }
    });
    public final ArrayList j0 = new ArrayList();
    public int k0;
    public ImagePagerAdapter l0;
    public SetAsDialog m0;
    public DownloadDialog n0;
    public int o0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ImagePreviewAct$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static void a(FragmentActivity fragmentActivity, int i2, PreviewBean previewBean, boolean z2) {
            Intent intent = new Intent(fragmentActivity, (Class<?>) ImagePreviewAct.class);
            intent.putExtra("key_list", previewBean);
            intent.putExtra("key_pos", i2);
            intent.putExtra("key_boolean", z2);
            fragmentActivity.startActivity(intent);
        }
    }

    @Override // pub.devrel.easypermissions.EasyPermissions.PermissionCallbacks
    public final void a(int i2, ArrayList arrayList) {
        if (i2 == 12) {
            s();
        }
    }

    @Override // pub.devrel.easypermissions.EasyPermissions.PermissionCallbacks
    public final void b(List perms) {
        Intrinsics.f(perms, "perms");
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void g() {
        ActPreviewBinding actPreviewBinding = this.h0;
        if (actPreviewBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actPreviewBinding.f13136b, new v(this, 1));
        ActPreviewBinding actPreviewBinding2 = this.h0;
        if (actPreviewBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actPreviewBinding2.d, new v(this, 2));
        ActPreviewBinding actPreviewBinding3 = this.h0;
        if (actPreviewBinding3 != null) {
            ViewExt.c(actPreviewBinding3.f13137c, new v(this, 3));
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void i() {
        PreviewBean previewBean;
        getWindow().addFlags(1024);
        getWindow().getDecorView().setSystemUiVisibility(6);
        if (getIntent().hasExtra("key_list")) {
            previewBean = Build.VERSION.SDK_INT >= 33 ? (PreviewBean) getIntent().getSerializableExtra("key_list", PreviewBean.class) : (PreviewBean) getIntent().getSerializableExtra("key_list");
        } else {
            previewBean = null;
        }
        if (previewBean == null) {
            finish();
            return;
        }
        ArrayList arrayList = this.j0;
        arrayList.clear();
        arrayList.addAll(previewBean.getList());
        if (arrayList.size() == 0) {
            finish();
            return;
        }
        int intExtra = getIntent().getIntExtra("key_pos", 0);
        this.k0 = intExtra;
        if (intExtra < 0 || intExtra >= arrayList.size()) {
            finish();
            return;
        }
        if (getIntent().getBooleanExtra("key_boolean", true)) {
            p(new u(this, 1));
        }
        t().d = (Image) arrayList.get(this.k0);
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View l() {
        View viewInflate = getLayoutInflater().inflate(R.layout.act_preview, (ViewGroup) null, false);
        int i2 = R.id.ivBack;
        ImageView imageView = (ImageView) ViewBindings.a(R.id.ivBack, viewInflate);
        if (imageView != null) {
            i2 = R.id.rlBottom;
            if (((LinearLayout) ViewBindings.a(R.id.rlBottom, viewInflate)) != null) {
                i2 = R.id.tvDownload;
                TextView textView = (TextView) ViewBindings.a(R.id.tvDownload, viewInflate);
                if (textView != null) {
                    i2 = R.id.tvSet;
                    TextView textView2 = (TextView) ViewBindings.a(R.id.tvSet, viewInflate);
                    if (textView2 != null) {
                        i2 = R.id.viewPager;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.a(R.id.viewPager, viewInflate);
                        if (viewPager2 != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                            this.h0 = new ActPreviewBinding(relativeLayout, imageView, textView, textView2, viewPager2);
                            Intrinsics.e(relativeLayout, "getRoot(...)");
                            return relativeLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View m() {
        return null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void o() {
        ImagePagerAdapter imagePagerAdapter = new ImagePagerAdapter(this, this.j0);
        this.l0 = imagePagerAdapter;
        imagePagerAdapter.k = new ImagePreviewAct$initViews$1();
        ActPreviewBinding actPreviewBinding = this.h0;
        if (actPreviewBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actPreviewBinding.f13138e.setAdapter(imagePagerAdapter);
        ActPreviewBinding actPreviewBinding2 = this.h0;
        if (actPreviewBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actPreviewBinding2.f13138e.d(this.k0, false);
        ActPreviewBinding actPreviewBinding3 = this.h0;
        if (actPreviewBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actPreviewBinding3.f13138e.b(new ViewPager2.OnPageChangeCallback() { // from class: com.charging.screenshow.battery.animations.themes.activity.ImagePreviewAct$initViews$2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void c(int i2) {
                ImagePreviewAct imagePreviewAct = this.f13036a;
                imagePreviewAct.k0 = i2;
                imagePreviewAct.t().d = (Image) imagePreviewAct.j0.get(imagePreviewAct.k0);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (j() && !n().f13353e && getIntent().getBooleanExtra("key_boolean", true)) {
            q(new u(this, 0));
        } else {
            finish();
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SetAsDialog setAsDialog = this.m0;
        if (setAsDialog != null) {
            setAsDialog.dismiss();
        }
        DownloadDialog downloadDialog = this.n0;
        if (downloadDialog != null) {
            downloadDialog.dismiss();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] permissions, int[] grantResults) {
        Intrinsics.f(permissions, "permissions");
        Intrinsics.f(grantResults, "grantResults");
        super.onRequestPermissionsResult(i2, permissions, grantResults);
        EasyPermissions.a(i2, permissions, grantResults, this);
    }

    public final void s() {
        if (Build.VERSION.SDK_INT < 29) {
            for (String str : (String[]) Arrays.copyOf(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 2)) {
                if (ContextCompat.checkSelfPermission(this, str) != 0) {
                    EasyPermissions.b(this, getString(R.string.storage_grant_permission_title), 12, (String[]) Arrays.copyOf(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 2));
                    return;
                }
            }
        }
        this.o0 = 1;
        if (u()) {
            v();
        } else {
            x();
        }
    }

    public final ImgPreviewVM t() {
        return (ImgPreviewVM) this.i0.getX();
    }

    public final boolean u() {
        Image image = t().d;
        Intrinsics.c(image);
        String url = image.getVariations().getAdapted().getUrl();
        Image image2 = t().d;
        Intrinsics.c(image2);
        return DownloadUtil.c(url, image2.d());
    }

    public final void v() {
        Image image = t().d;
        if (image != null) {
            String imagePath = DownloadUtil.b(image.getVariations().getAdapted().getUrl(), image.d());
            Intrinsics.f(imagePath, "imagePath");
            boolean z2 = true;
            if (Build.VERSION.SDK_INT < 29) {
                try {
                    File file = new File(MediaUtil.c() + File.separator + new File(imagePath).getName());
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    MediaUtil.a(imagePath, fileOutputStream);
                    sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
                    fileOutputStream.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    z2 = false;
                }
            } else {
                try {
                    ContentResolver contentResolver = getContentResolver();
                    ContentValues contentValuesB = MediaUtil.b(new File(imagePath));
                    Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValuesB);
                    ContentResolver contentResolver2 = getContentResolver();
                    Intrinsics.c(uriInsert);
                    MediaUtil.a(imagePath, contentResolver2.openOutputStream(uriInsert));
                    contentValuesB.clear();
                    contentValuesB.put("is_pending", (Integer) 0);
                    contentValuesB.putNull("date_expires");
                    contentResolver.update(uriInsert, contentValuesB, null, null);
                } catch (Exception e3) {
                    e3.printStackTrace();
                    z2 = false;
                }
            }
            if (isFinishing()) {
                return;
            }
            if (z2) {
                Typeface typeface = Toasty.f42874a;
                Toasty.a(this, getString(R.string.saved_to_album), AppCompatResources.a(this, 2131231226), ContextCompat.getColor(this, R.color.successColor), ContextCompat.getColor(this, R.color.defaultTextColor)).show();
            } else {
                Typeface typeface2 = Toasty.f42874a;
                Toasty.b(this, getString(R.string.save_failed)).show();
            }
        }
    }

    public final void w() {
        Image image = t().d;
        if (image != null) {
            File file = new File(DownloadUtil.b(image.getVariations().getAdapted().getUrl(), image.d()));
            if (file.exists()) {
                WallpaperManager wallpaperManager = WallpaperManager.getInstance(this);
                if (this.m0 == null) {
                    this.m0 = new SetAsDialog(this, new F(this, wallpaperManager, file, 2));
                }
                SetAsDialog setAsDialog = this.m0;
                if (setAsDialog != null) {
                    setAsDialog.show();
                }
            }
        }
    }

    public final void x() {
        if (isFinishing()) {
            return;
        }
        Image image = t().d;
        Intrinsics.c(image);
        ArrayList arrayListL = CollectionsKt.L(image.getVariations().getAdapted().getUrl());
        Image image2 = t().d;
        Intrinsics.c(image2);
        DownloadDialog downloadDialog = new DownloadDialog(this, arrayListL, image2.d(), IntExt.c(R.string.downloading_image), new v(this, 0));
        this.n0 = downloadDialog;
        downloadDialog.show();
    }
}
