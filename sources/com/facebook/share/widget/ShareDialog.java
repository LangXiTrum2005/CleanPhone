package com.facebook.share.widget;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.Utility;
import com.facebook.share.Sharer;
import com.facebook.share.internal.CameraEffectFeature;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.internal.OpenGraphActionDialogFeature;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.ShareStoryFeature;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareDialog extends FacebookDialogBase<ShareContent, Sharer.Result> implements Sharer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f16648h = 0;
    public boolean g;

    /* JADX INFO: renamed from: com.facebook.share.widget.ShareDialog$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16649a;

        static {
            int[] iArr = new int[Mode.values().length];
            f16649a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16649a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16649a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class CameraEffectHandler extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler {
        public CameraEffectHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final boolean a(Object obj, boolean z2) {
            DialogFeature dialogFeatureJ;
            ShareContent shareContent = (ShareContent) obj;
            return (shareContent instanceof ShareCameraEffectContent) && (dialogFeatureJ = ShareDialog.j(shareContent.getClass())) != null && DialogPresenter.a(dialogFeatureJ);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            final ShareContent shareContent = (ShareContent) obj;
            ShareContentValidation.b(shareContent, ShareContentValidation.a());
            final AppCall appCallC = ShareDialog.this.c();
            DialogPresenter.d(appCallC, new DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.ShareDialog.CameraEffectHandler.1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public final Bundle a() {
                    return LegacyNativeDialogParameters.a(appCallC.b(), shareContent);
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public final Bundle getParameters() {
                    return NativeDialogParameters.a(appCallC.b(), shareContent);
                }
            }, ShareDialog.j(shareContent.getClass()));
            return appCallC;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final Object c() {
            return Mode.f16654Y;
        }
    }

    public class FeedHandler extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler {
        public FeedHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final boolean a(Object obj, boolean z2) {
            ShareContent shareContent = (ShareContent) obj;
            return (shareContent instanceof ShareLinkContent) || (shareContent instanceof ShareFeedContent);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            Bundle bundle;
            ShareContent shareContent = (ShareContent) obj;
            int i2 = ShareDialog.f16648h;
            ShareDialog shareDialog = ShareDialog.this;
            ShareDialog.i(shareDialog, shareDialog.d(), shareContent, Mode.e0);
            AppCall appCallC = shareDialog.c();
            if (shareContent instanceof ShareLinkContent) {
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
                ShareContentValidation.d(shareLinkContent);
                bundle = new Bundle();
                Utility.O(bundle, "name", shareLinkContent.i0);
                Utility.O(bundle, "description", shareLinkContent.h0);
                Utility.O(bundle, "link", Utility.v(shareLinkContent.X));
                Utility.O(bundle, "picture", Utility.v(shareLinkContent.j0));
                Utility.O(bundle, "quote", shareLinkContent.k0);
                ShareHashtag shareHashtag = shareLinkContent.g0;
                if (shareHashtag != null) {
                    Utility.O(bundle, "hashtag", shareHashtag.X);
                }
            } else {
                ShareFeedContent shareFeedContent = (ShareFeedContent) shareContent;
                bundle = new Bundle();
                Utility.O(bundle, "to", shareFeedContent.h0);
                Utility.O(bundle, "link", shareFeedContent.i0);
                Utility.O(bundle, "picture", shareFeedContent.m0);
                Utility.O(bundle, "source", shareFeedContent.n0);
                Utility.O(bundle, "name", shareFeedContent.j0);
                Utility.O(bundle, "caption", shareFeedContent.k0);
                Utility.O(bundle, "description", shareFeedContent.l0);
            }
            DialogPresenter.f(appCallC, "feed", bundle);
            return appCallC;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final Object c() {
            return Mode.e0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {
        public static final Mode X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Mode f16654Y;
        public static final Mode Z;
        public static final Mode e0;
        public static final /* synthetic */ Mode[] f0;

        static {
            Mode mode = new Mode("AUTOMATIC", 0);
            X = mode;
            Mode mode2 = new Mode("NATIVE", 1);
            f16654Y = mode2;
            Mode mode3 = new Mode("WEB", 2);
            Z = mode3;
            Mode mode4 = new Mode("FEED", 3);
            e0 = mode4;
            f0 = new Mode[]{mode, mode2, mode3, mode4};
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f0.clone();
        }
    }

    public class NativeHandler extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler {
        public NativeHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final boolean a(Object obj, boolean z2) {
            boolean zA;
            ShareContent shareContent = (ShareContent) obj;
            if (shareContent != null && !(shareContent instanceof ShareCameraEffectContent) && !(shareContent instanceof ShareStoryContent)) {
                if (z2) {
                    zA = true;
                } else {
                    zA = shareContent.g0 != null ? DialogPresenter.a(ShareDialogFeature.HASHTAG) : true;
                    if ((shareContent instanceof ShareLinkContent) && !Utility.C(((ShareLinkContent) shareContent).k0)) {
                        zA &= DialogPresenter.a(ShareDialogFeature.LINK_SHARE_QUOTES);
                    }
                }
                if (zA) {
                    DialogFeature dialogFeatureJ = ShareDialog.j(shareContent.getClass());
                    if (dialogFeatureJ != null && DialogPresenter.a(dialogFeatureJ)) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            final ShareContent shareContent = (ShareContent) obj;
            int i2 = ShareDialog.f16648h;
            ShareDialog shareDialog = ShareDialog.this;
            ShareDialog.i(shareDialog, shareDialog.d(), shareContent, Mode.f16654Y);
            ShareContentValidation.b(shareContent, ShareContentValidation.a());
            final AppCall appCallC = shareDialog.c();
            DialogPresenter.d(appCallC, new DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.ShareDialog.NativeHandler.1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public final Bundle a() {
                    return LegacyNativeDialogParameters.a(appCallC.b(), shareContent);
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public final Bundle getParameters() {
                    return NativeDialogParameters.a(appCallC.b(), shareContent);
                }
            }, ShareDialog.j(shareContent.getClass()));
            return appCallC;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final Object c() {
            return Mode.f16654Y;
        }
    }

    public class ShareStoryHandler extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler {
        public ShareStoryHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final boolean a(Object obj, boolean z2) {
            DialogFeature dialogFeatureJ;
            ShareContent shareContent = (ShareContent) obj;
            return (shareContent instanceof ShareStoryContent) && (dialogFeatureJ = ShareDialog.j(shareContent.getClass())) != null && DialogPresenter.a(dialogFeatureJ);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            final ShareContent shareContent = (ShareContent) obj;
            ShareContentValidation.c(shareContent);
            final AppCall appCallC = ShareDialog.this.c();
            DialogPresenter.d(appCallC, new DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.ShareDialog.ShareStoryHandler.1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public final Bundle a() {
                    return LegacyNativeDialogParameters.a(appCallC.b(), shareContent);
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public final Bundle getParameters() {
                    return NativeDialogParameters.a(appCallC.b(), shareContent);
                }
            }, ShareDialog.j(shareContent.getClass()));
            return appCallC;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final Object c() {
            return Mode.f16654Y;
        }
    }

    public class WebShareHandler extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler {
        public WebShareHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final boolean a(Object obj, boolean z2) {
            ShareContent shareContent = (ShareContent) obj;
            if (shareContent == null) {
                return false;
            }
            int i2 = ShareDialog.f16648h;
            Class<?> cls = shareContent.getClass();
            if (!ShareLinkContent.class.isAssignableFrom(cls) && !ShareOpenGraphContent.class.isAssignableFrom(cls)) {
                if (!SharePhotoContent.class.isAssignableFrom(cls)) {
                    return false;
                }
                Date date = AccessToken.m0;
                if (!AccessToken.Companion.c()) {
                    return false;
                }
            }
            if (!(shareContent instanceof ShareOpenGraphContent)) {
                return true;
            }
            try {
                ShareInternalUtility.q((ShareOpenGraphContent) shareContent);
                return true;
            } catch (Exception unused) {
                HashSet hashSet = FacebookSdk.f15915a;
                return false;
            }
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            Bundle bundleB;
            ShareContent shareContent = (ShareContent) obj;
            int i2 = ShareDialog.f16648h;
            ShareDialog shareDialog = ShareDialog.this;
            ShareDialog.i(shareDialog, shareDialog.d(), shareContent, Mode.Z);
            AppCall appCallC = shareDialog.c();
            ShareContentValidation.d(shareContent);
            boolean z2 = shareContent instanceof ShareLinkContent;
            String str = null;
            if (z2) {
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
                bundleB = WebDialogParameters.d(shareLinkContent);
                Uri uri = shareLinkContent.X;
                if (uri != null) {
                    Utility.O(bundleB, "href", uri.toString());
                }
                Utility.O(bundleB, "quote", shareLinkContent.k0);
            } else if (shareContent instanceof SharePhotoContent) {
                SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
                UUID callId = appCallC.b();
                SharePhotoContent.Builder builder = new SharePhotoContent.Builder();
                builder.f16613a = sharePhotoContent.X;
                List list = sharePhotoContent.f16612Y;
                builder.f16614b = list == null ? null : Collections.unmodifiableList(list);
                builder.f16615c = sharePhotoContent.Z;
                builder.d = sharePhotoContent.e0;
                builder.f16616e = sharePhotoContent.f0;
                builder.f = sharePhotoContent.g0;
                List list2 = sharePhotoContent.h0;
                builder.a(list2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    SharePhoto sharePhoto = (SharePhoto) list2.get(i3);
                    Bitmap bitmap = sharePhoto.f16623Y;
                    if (bitmap != null) {
                        Intrinsics.f(callId, "callId");
                        NativeAppCallAttachmentStore.Attachment attachment = new NativeAppCallAttachmentStore.Attachment(callId, bitmap, null);
                        SharePhoto.Builder builder2 = new SharePhoto.Builder();
                        builder2.a(sharePhoto);
                        builder2.f16625c = Uri.parse(attachment.f16356a);
                        builder2.f16624b = null;
                        sharePhoto = new SharePhoto(builder2);
                        arrayList2.add(attachment);
                    }
                    arrayList.add(sharePhoto);
                }
                builder.g.clear();
                builder.a(arrayList);
                NativeAppCallAttachmentStore.a(arrayList2);
                bundleB = WebDialogParameters.c(new SharePhotoContent(builder));
            } else {
                bundleB = WebDialogParameters.b((ShareOpenGraphContent) shareContent);
            }
            if (z2 || (shareContent instanceof SharePhotoContent)) {
                str = AppLovinEventTypes.USER_SHARED_LINK;
            } else if (shareContent instanceof ShareOpenGraphContent) {
                str = "share_open_graph";
            }
            DialogPresenter.f(appCallC, str, bundleB);
            return appCallC;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final Object c() {
            return Mode.Z;
        }
    }

    static {
        CallbackManagerImpl.RequestCodeOffset.Share.d();
    }

    public ShareDialog(FragmentWrapper fragmentWrapper, int i2) {
        super(fragmentWrapper, i2);
        this.g = true;
        ShareInternalUtility.m(i2);
    }

    public static void i(ShareDialog shareDialog, Activity activity, ShareContent shareContent, Mode mode) {
        String str;
        if (shareDialog.g) {
            mode = Mode.X;
        }
        int iOrdinal = mode.ordinal();
        String str2 = "unknown";
        if (iOrdinal == 0) {
            str = "automatic";
        } else if (iOrdinal != 1) {
            str = iOrdinal != 2 ? "unknown" : "web";
        } else {
            str = "native";
        }
        DialogFeature dialogFeatureJ = j(shareContent.getClass());
        if (dialogFeatureJ == ShareDialogFeature.SHARE_DIALOG) {
            str2 = "status";
        } else if (dialogFeatureJ == ShareDialogFeature.PHOTOS) {
            str2 = "photo";
        } else if (dialogFeatureJ == ShareDialogFeature.VIDEO) {
            str2 = "video";
        } else if (dialogFeatureJ == OpenGraphActionDialogFeature.f16587Y) {
            str2 = "open_graph";
        }
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(activity);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        internalAppEventsLogger.d(bundle, "fb_share_dialog_show");
    }

    public static DialogFeature j(Class cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.SHARE_DIALOG;
        }
        if (SharePhotoContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.PHOTOS;
        }
        if (ShareVideoContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.VIDEO;
        }
        if (ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            return OpenGraphActionDialogFeature.f16587Y;
        }
        if (ShareMediaContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.MULTIMEDIA;
        }
        if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
            return CameraEffectFeature.f16529Y;
        }
        if (ShareStoryContent.class.isAssignableFrom(cls)) {
            return ShareStoryFeature.f16603Y;
        }
        return null;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final AppCall c() {
        return new AppCall(this.d, 0);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NativeHandler());
        arrayList.add(new FeedHandler());
        arrayList.add(new WebShareHandler());
        arrayList.add(new CameraEffectHandler());
        arrayList.add(new ShareStoryHandler());
        return arrayList;
    }
}
