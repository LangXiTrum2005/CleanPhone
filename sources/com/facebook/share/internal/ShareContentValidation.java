package com.facebook.share.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.a;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateElement;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.p004ironsource.d9;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class ShareContentValidation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WebShareValidator f16589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Validator f16590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static StoryShareValidator f16591c;

    public static class ApiValidator extends Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public final void a(ShareLinkContent shareLinkContent) {
            if (!Utility.C(shareLinkContent.k0)) {
                throw new FacebookException("Cannot share link content with quote using the share api");
            }
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public final void c(ShareMediaContent shareMediaContent) {
            throw new FacebookException("Cannot share ShareMediaContent using the share api");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public final void e(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                throw new FacebookException("Cannot share a null SharePhoto");
            }
            Uri uri = sharePhoto.Z;
            Bitmap bitmap = sharePhoto.f16623Y;
            if (bitmap == null && uri == null) {
                throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            if (bitmap == null && Utility.E(uri) && !this.f16592a) {
                throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            }
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public final void h(ShareVideoContent shareVideoContent) {
            if (!Utility.C(shareVideoContent.Z)) {
                throw new FacebookException("Cannot share video content with place IDs using the share api");
            }
            if (!Utility.D(shareVideoContent.f16612Y)) {
                throw new FacebookException("Cannot share video content with people IDs using the share api");
            }
            if (!Utility.C(shareVideoContent.f0)) {
                throw new FacebookException("Cannot share video content with referrer URL using the share api");
            }
        }
    }

    public static class StoryShareValidator extends Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public final void f(ShareStoryContent shareStoryContent) {
            if (shareStoryContent != null) {
                SharePhoto sharePhoto = shareStoryContent.i0;
                ShareMedia shareMedia = shareStoryContent.h0;
                if (shareMedia != null || sharePhoto != null) {
                    if (shareMedia != null) {
                        b(shareMedia);
                    }
                    if (sharePhoto != null) {
                        e(sharePhoto);
                        return;
                    }
                    return;
                }
            }
            throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
    }

    public static class Validator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f16592a = false;

        public static void g(ShareVideo shareVideo) {
            if (shareVideo == null) {
                throw new FacebookException("Cannot share a null ShareVideo");
            }
            Uri uri = shareVideo.f16627Y;
            if (uri == null) {
                throw new FacebookException("ShareVideo does not have a LocalUrl specified");
            }
            if (!"content".equalsIgnoreCase(uri.getScheme()) && !d9.h.f24719b.equalsIgnoreCase(uri.getScheme())) {
                throw new FacebookException("ShareVideo must reference a video that is on the device");
            }
        }

        public void a(ShareLinkContent shareLinkContent) {
            Uri uri = shareLinkContent.j0;
            if (uri != null && !Utility.E(uri)) {
                throw new FacebookException("Image Url must be an http:// or https:// url");
            }
        }

        public final void b(ShareMedia shareMedia) {
            if (shareMedia instanceof SharePhoto) {
                e((SharePhoto) shareMedia);
            } else if (shareMedia instanceof ShareVideo) {
                g((ShareVideo) shareMedia);
            } else {
                Locale locale = Locale.ROOT;
                throw new FacebookException("Invalid media type: ".concat(shareMedia.getClass().getSimpleName()));
            }
        }

        public void c(ShareMediaContent shareMediaContent) {
            List list = shareMediaContent.h0;
            if (list == null || list.isEmpty()) {
                throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
            }
            if (list.size() > 6) {
                Locale locale = Locale.ROOT;
                throw new FacebookException("Cannot add more than 6 media.");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b((ShareMedia) it.next());
            }
        }

        public final void d(ShareOpenGraphValueContainer shareOpenGraphValueContainer, boolean z2) {
            for (String str : shareOpenGraphValueContainer.X.keySet()) {
                if (z2) {
                    String[] strArrSplit = str.split(":");
                    if (strArrSplit.length < 2) {
                        throw new FacebookException("Open Graph keys must be namespaced: %s", str);
                    }
                    for (String str2 : strArrSplit) {
                        if (str2.isEmpty()) {
                            throw new FacebookException("Invalid key found in Open Graph dictionary: %s", str);
                        }
                    }
                }
                Object obj = shareOpenGraphValueContainer.X.get(str);
                if (obj instanceof List) {
                    for (Object obj2 : (List) obj) {
                        if (obj2 == null) {
                            throw new FacebookException("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                        }
                        ShareContentValidation.e(obj2, this);
                    }
                } else {
                    ShareContentValidation.e(obj, this);
                }
            }
        }

        public void e(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                throw new FacebookException("Cannot share a null SharePhoto");
            }
            Bitmap bitmap = sharePhoto.f16623Y;
            Uri uri = sharePhoto.Z;
            if (bitmap == null && uri == null) {
                throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            if (bitmap == null && Utility.E(uri) && !this.f16592a) {
                throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            }
            if (bitmap == null && Utility.E(uri)) {
                return;
            }
            Context context = FacebookSdk.b();
            Intrinsics.f(context, "context");
            String strC = FacebookSdk.c();
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                String strConcat = "com.facebook.app.FacebookContentProvider".concat(strC);
                if (packageManager.resolveContentProvider(strConcat, 0) == null) {
                    throw new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", Arrays.copyOf(new Object[]{strConcat}, 1)).toString());
                }
            }
        }

        public void f(ShareStoryContent shareStoryContent) {
            if (shareStoryContent != null) {
                SharePhoto sharePhoto = shareStoryContent.i0;
                ShareMedia shareMedia = shareStoryContent.h0;
                if (shareMedia != null || sharePhoto != null) {
                    if (shareMedia != null) {
                        b(shareMedia);
                    }
                    if (sharePhoto != null) {
                        e(sharePhoto);
                        return;
                    }
                    return;
                }
            }
            throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        }

        public void h(ShareVideoContent shareVideoContent) {
            g(shareVideoContent.k0);
            SharePhoto sharePhoto = shareVideoContent.j0;
            if (sharePhoto != null) {
                e(sharePhoto);
            }
        }
    }

    public static class WebShareValidator extends Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public final void c(ShareMediaContent shareMediaContent) {
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public final void e(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                throw new FacebookException("Cannot share a null SharePhoto");
            }
            if (sharePhoto.f16623Y == null && sharePhoto.Z == null) {
                throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public final void h(ShareVideoContent shareVideoContent) {
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    public static Validator a() {
        if (f16590b == null) {
            f16590b = new Validator();
        }
        return f16590b;
    }

    public static void b(ShareContent shareContent, Validator validator) {
        if (shareContent == null) {
            throw new FacebookException("Must provide non-null content to share");
        }
        if (shareContent instanceof ShareLinkContent) {
            validator.a((ShareLinkContent) shareContent);
            return;
        }
        if (shareContent instanceof SharePhotoContent) {
            validator.getClass();
            List list = ((SharePhotoContent) shareContent).h0;
            if (list == null || list.isEmpty()) {
                throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
            }
            if (list.size() > 6) {
                Locale locale = Locale.ROOT;
                throw new FacebookException("Cannot add more than 6 photos.");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                validator.e((SharePhoto) it.next());
            }
            return;
        }
        if (shareContent instanceof ShareVideoContent) {
            validator.h((ShareVideoContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            validator.f16592a = true;
            ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.h0;
            if (shareOpenGraphAction == null) {
                throw new FacebookException("Must specify a non-null ShareOpenGraphAction");
            }
            Bundle bundle = shareOpenGraphAction.X;
            if (Utility.C(bundle.getString("og:type"))) {
                throw new FacebookException("ShareOpenGraphAction must have a non-empty actionType");
            }
            validator.d(shareOpenGraphAction, false);
            String str = shareOpenGraphContent.i0;
            if (Utility.C(str)) {
                throw new FacebookException("Must specify a previewPropertyName.");
            }
            if (bundle.get(str) == null) {
                throw new FacebookException(a.n("Property \"", str, "\" was not found on the action. The name of the preview property must match the name of an action property."));
            }
            return;
        }
        if (shareContent instanceof ShareMediaContent) {
            validator.c((ShareMediaContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareCameraEffectContent) {
            validator.getClass();
            if (Utility.C(((ShareCameraEffectContent) shareContent).h0)) {
                throw new FacebookException("Must specify a non-empty effectId");
            }
            return;
        }
        if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
            ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent = (ShareMessengerOpenGraphMusicTemplateContent) shareContent;
            validator.getClass();
            if (Utility.C(shareMessengerOpenGraphMusicTemplateContent.e0)) {
                throw new FacebookException("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
            }
            if (shareMessengerOpenGraphMusicTemplateContent.h0 == null) {
                throw new FacebookException("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
            }
            f(shareMessengerOpenGraphMusicTemplateContent.i0);
            return;
        }
        if (shareContent instanceof ShareMessengerMediaTemplateContent) {
            ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent = (ShareMessengerMediaTemplateContent) shareContent;
            validator.getClass();
            if (Utility.C(shareMessengerMediaTemplateContent.e0)) {
                throw new FacebookException("Must specify Page Id for ShareMessengerMediaTemplateContent");
            }
            if (shareMessengerMediaTemplateContent.j0 == null && Utility.C(shareMessengerMediaTemplateContent.i0)) {
                throw new FacebookException("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
            }
            f(shareMessengerMediaTemplateContent.k0);
            return;
        }
        if (!(shareContent instanceof ShareMessengerGenericTemplateContent)) {
            if (shareContent instanceof ShareStoryContent) {
                validator.f((ShareStoryContent) shareContent);
                return;
            }
            return;
        }
        ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent = (ShareMessengerGenericTemplateContent) shareContent;
        validator.getClass();
        if (Utility.C(shareMessengerGenericTemplateContent.e0)) {
            throw new FacebookException("Must specify Page Id for ShareMessengerGenericTemplateContent");
        }
        ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement = shareMessengerGenericTemplateContent.j0;
        if (shareMessengerGenericTemplateElement == null) {
            throw new FacebookException("Must specify element for ShareMessengerGenericTemplateContent");
        }
        if (Utility.C(shareMessengerGenericTemplateElement.X)) {
            throw new FacebookException("Must specify title for ShareMessengerGenericTemplateElement");
        }
        f(shareMessengerGenericTemplateElement.f0);
    }

    public static void c(ShareContent shareContent) {
        if (f16591c == null) {
            f16591c = new StoryShareValidator();
        }
        b(shareContent, f16591c);
    }

    public static void d(ShareContent shareContent) {
        if (f16589a == null) {
            f16589a = new WebShareValidator();
        }
        b(shareContent, f16589a);
    }

    public static void e(Object obj, Validator validator) {
        if (!(obj instanceof ShareOpenGraphObject)) {
            if (obj instanceof SharePhoto) {
                validator.e((SharePhoto) obj);
            }
        } else {
            ShareOpenGraphObject shareOpenGraphObject = (ShareOpenGraphObject) obj;
            if (shareOpenGraphObject == null) {
                throw new FacebookException("Cannot share a null ShareOpenGraphObject");
            }
            validator.d(shareOpenGraphObject, true);
        }
    }

    public static void f(ShareMessengerActionButton shareMessengerActionButton) {
        if (shareMessengerActionButton == null) {
            return;
        }
        if (Utility.C(shareMessengerActionButton.X)) {
            throw new FacebookException("Must specify title for ShareMessengerActionButton");
        }
        if ((shareMessengerActionButton instanceof ShareMessengerURLActionButton) && ((ShareMessengerURLActionButton) shareMessengerActionButton).f16621Y == null) {
            throw new FacebookException("Must specify url for ShareMessengerURLActionButton");
        }
    }
}
