package com.facebook.share.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class NativeDialogParameters {
    /* JADX WARN: Code duplicated, block: B:81:0x01a7  */
    public static Bundle a(UUID uuid, ShareContent shareContent) {
        ShareMedia shareMedia;
        Bundle bundle;
        SharePhoto sharePhoto;
        Bundle bundle2;
        NativeAppCallAttachmentStore.Attachment attachment;
        Validate.f(shareContent, "shareContent");
        Validate.f(uuid, "callId");
        if (shareContent instanceof ShareLinkContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            Bundle bundleB = b(shareLinkContent, false);
            Utility.O(bundleB, "TITLE", shareLinkContent.i0);
            Utility.O(bundleB, "DESCRIPTION", shareLinkContent.h0);
            Uri uri = shareLinkContent.j0;
            if (uri != null) {
                Utility.O(bundleB, "IMAGE", uri.toString());
            }
            Utility.O(bundleB, "QUOTE", shareLinkContent.k0);
            Uri uri2 = shareLinkContent.X;
            if (uri2 != null) {
                Utility.O(bundleB, "MESSENGER_LINK", uri2.toString());
            }
            if (uri2 != null) {
                Utility.O(bundleB, "TARGET_DISPLAY", uri2.toString());
            }
            return bundleB;
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            ArrayList arrayListD = ShareInternalUtility.d(sharePhotoContent, uuid);
            Bundle bundleB2 = b(sharePhotoContent, false);
            bundleB2.putStringArrayList("PHOTOS", new ArrayList<>(arrayListD));
            return bundleB2;
        }
        str = null;
        str = null;
        String str = null;
        arrayList = null;
        arrayList = null;
        ArrayList arrayList = null;
        bundle = null;
        bundle = null;
        Bundle bundle3 = null;
        if (shareContent instanceof ShareVideoContent) {
            ShareVideoContent shareVideoContent = (ShareVideoContent) shareContent;
            if (!CrashShieldHandler.b(ShareInternalUtility.class)) {
                try {
                    ShareVideo shareVideo = shareVideoContent.k0;
                    if (shareVideo != null) {
                        Uri attachmentUri = shareVideo.f16627Y;
                        Intrinsics.f(attachmentUri, "attachmentUri");
                        NativeAppCallAttachmentStore.Attachment attachment2 = new NativeAppCallAttachmentStore.Attachment(uuid, null, attachmentUri);
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(attachment2);
                        NativeAppCallAttachmentStore.a(arrayList2);
                        str = attachment2.f16356a;
                    }
                } catch (Throwable th) {
                    CrashShieldHandler.a(ShareInternalUtility.class, th);
                }
            }
            Bundle bundleB3 = b(shareVideoContent, false);
            Utility.O(bundleB3, "TITLE", shareVideoContent.i0);
            Utility.O(bundleB3, "DESCRIPTION", shareVideoContent.h0);
            Utility.O(bundleB3, "VIDEO", str);
            return bundleB3;
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                JSONObject jSONObjectO = ShareInternalUtility.o(ShareInternalUtility.p(uuid, shareOpenGraphContent), false);
                Bundle bundleB4 = b(shareOpenGraphContent, false);
                Utility.O(bundleB4, "PREVIEW_PROPERTY_NAME", (String) ShareInternalUtility.b(shareOpenGraphContent.i0).second);
                Utility.O(bundleB4, "ACTION_TYPE", shareOpenGraphContent.h0.X.getString("og:type"));
                Utility.O(bundleB4, "ACTION", jSONObjectO.toString());
                return bundleB4;
            } catch (JSONException e2) {
                throw new FacebookException("Unable to create a JSON Object from the provided ShareOpenGraphContent: " + e2.getMessage());
            }
        }
        if (shareContent instanceof ShareMediaContent) {
            ShareMediaContent shareMediaContent = (ShareMediaContent) shareContent;
            if (!CrashShieldHandler.b(ShareInternalUtility.class)) {
                try {
                    List list = shareMediaContent.h0;
                    if (list != null) {
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayListI = Utility.I(list, new Utility.Mapper<ShareMedia, Bundle>() { // from class: com.facebook.share.internal.ShareInternalUtility.6

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ UUID f16598a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ ArrayList f16599b;

                            public AnonymousClass6() {
                                uuid = uuid;
                                arrayList = arrayList3;
                            }

                            @Override // com.facebook.internal.Utility.Mapper
                            public final Object apply(Object obj) {
                                ShareMedia shareMedia2 = (ShareMedia) obj;
                                NativeAppCallAttachmentStore.Attachment attachmentA = ShareInternalUtility.a(uuid, shareMedia2);
                                arrayList.add(attachmentA);
                                Bundle bundle4 = new Bundle();
                                bundle4.putString("type", shareMedia2.a().name());
                                bundle4.putString("uri", attachmentA.f16356a);
                                return bundle4;
                            }
                        });
                        NativeAppCallAttachmentStore.a(arrayList3);
                        arrayList = arrayListI;
                    }
                } catch (Throwable th2) {
                    CrashShieldHandler.a(ShareInternalUtility.class, th2);
                }
            }
            Bundle bundleB5 = b(shareMediaContent, false);
            bundleB5.putParcelableArrayList("MEDIA", new ArrayList<>(arrayList));
            return bundleB5;
        }
        if (shareContent instanceof ShareCameraEffectContent) {
            ShareCameraEffectContent shareCameraEffectContent = (ShareCameraEffectContent) shareContent;
            if (!CrashShieldHandler.b(ShareInternalUtility.class)) {
                try {
                    CameraEffectTextures cameraEffectTextures = shareCameraEffectContent.j0;
                    if (cameraEffectTextures != null) {
                        Bundle bundle4 = cameraEffectTextures.X;
                        Bundle bundle5 = new Bundle();
                        ArrayList arrayList4 = new ArrayList();
                        for (String str2 : bundle4.keySet()) {
                            Object obj = bundle4.get(str2);
                            Uri uri3 = obj instanceof Uri ? (Uri) obj : null;
                            Object obj2 = bundle4.get(str2);
                            Bitmap bitmap = obj2 instanceof Bitmap ? (Bitmap) obj2 : null;
                            if (CrashShieldHandler.b(ShareInternalUtility.class)) {
                                attachment = null;
                            } else if (bitmap != null) {
                                try {
                                    attachment = new NativeAppCallAttachmentStore.Attachment(uuid, bitmap, null);
                                } catch (Throwable th3) {
                                    CrashShieldHandler.a(ShareInternalUtility.class, th3);
                                    attachment = null;
                                }
                            } else if (uri3 != null) {
                                attachment = new NativeAppCallAttachmentStore.Attachment(uuid, null, uri3);
                            } else {
                                attachment = null;
                            }
                            arrayList4.add(attachment);
                            bundle5.putString(str2, attachment.f16356a);
                        }
                        NativeAppCallAttachmentStore.a(arrayList4);
                        bundle3 = bundle5;
                    }
                } catch (Throwable th4) {
                    CrashShieldHandler.a(ShareInternalUtility.class, th4);
                }
            }
            Bundle bundleB6 = b(shareCameraEffectContent, false);
            Utility.O(bundleB6, "effect_id", shareCameraEffectContent.h0);
            if (bundle3 != null) {
                bundleB6.putBundle("effect_textures", bundle3);
            }
            try {
                JSONObject jSONObjectA = CameraEffectJSONUtility.a(shareCameraEffectContent.i0);
                if (jSONObjectA == null) {
                    return bundleB6;
                }
                Utility.O(bundleB6, "effect_arguments", jSONObjectA.toString());
                return bundleB6;
            } catch (JSONException e3) {
                throw new FacebookException("Unable to create a JSON Object from the provided CameraEffectArguments: " + e3.getMessage());
            }
        }
        if (shareContent instanceof ShareMessengerGenericTemplateContent) {
            ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent = (ShareMessengerGenericTemplateContent) shareContent;
            Bundle bundleB7 = b(shareMessengerGenericTemplateContent, false);
            try {
                Pattern pattern = MessengerShareContentUtility.f16585a;
                if (!CrashShieldHandler.b(MessengerShareContentUtility.class)) {
                    try {
                        MessengerShareContentUtility.b(bundleB7, shareMessengerGenericTemplateContent.j0);
                        Utility.N(bundleB7, "MESSENGER_PLATFORM_CONTENT", MessengerShareContentUtility.i(shareMessengerGenericTemplateContent));
                    } catch (Throwable th5) {
                        CrashShieldHandler.a(MessengerShareContentUtility.class, th5);
                    }
                }
                return bundleB7;
            } catch (JSONException e4) {
                throw new FacebookException("Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: " + e4.getMessage());
            }
        }
        if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
            ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent = (ShareMessengerOpenGraphMusicTemplateContent) shareContent;
            Bundle bundleB8 = b(shareMessengerOpenGraphMusicTemplateContent, false);
            try {
                MessengerShareContentUtility.d(bundleB8, shareMessengerOpenGraphMusicTemplateContent);
                return bundleB8;
            } catch (JSONException e5) {
                throw new FacebookException("Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: " + e5.getMessage());
            }
        }
        if (shareContent instanceof ShareMessengerMediaTemplateContent) {
            ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent = (ShareMessengerMediaTemplateContent) shareContent;
            Bundle bundleB9 = b(shareMessengerMediaTemplateContent, false);
            try {
                Pattern pattern2 = MessengerShareContentUtility.f16585a;
                if (CrashShieldHandler.b(MessengerShareContentUtility.class)) {
                    return bundleB9;
                }
                try {
                    MessengerShareContentUtility.c(bundleB9, shareMessengerMediaTemplateContent);
                    Utility.N(bundleB9, "MESSENGER_PLATFORM_CONTENT", MessengerShareContentUtility.k(shareMessengerMediaTemplateContent));
                    return bundleB9;
                } catch (Throwable th6) {
                    CrashShieldHandler.a(MessengerShareContentUtility.class, th6);
                    return bundleB9;
                }
            } catch (JSONException e6) {
                throw new FacebookException("Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: " + e6.getMessage());
            }
        }
        if (!(shareContent instanceof ShareStoryContent)) {
            return null;
        }
        ShareStoryContent shareStoryContent = (ShareStoryContent) shareContent;
        if (CrashShieldHandler.b(ShareInternalUtility.class) || (shareMedia = shareStoryContent.h0) == null) {
            bundle = null;
        } else {
            try {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(shareMedia);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayListI2 = Utility.I(arrayList5, new Utility.Mapper<ShareMedia, Bundle>() { // from class: com.facebook.share.internal.ShareInternalUtility.11

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ UUID f16594a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ ArrayList f16595b;

                    public AnonymousClass11() {
                        uuid = uuid;
                        arrayList = arrayList6;
                    }

                    @Override // com.facebook.internal.Utility.Mapper
                    public final Object apply(Object obj3) {
                        ShareMedia shareMedia2 = (ShareMedia) obj3;
                        NativeAppCallAttachmentStore.Attachment attachmentA = ShareInternalUtility.a(uuid, shareMedia2);
                        arrayList.add(attachmentA);
                        Bundle bundle6 = new Bundle();
                        bundle6.putString("type", shareMedia2.a().name());
                        bundle6.putString("uri", attachmentA.f16356a);
                        String strE = ShareInternalUtility.e(attachmentA.g);
                        if (strE != null) {
                            Utility.O(bundle6, "extension", strE);
                        }
                        return bundle6;
                    }
                });
                NativeAppCallAttachmentStore.a(arrayList6);
                bundle = (Bundle) arrayListI2.get(0);
            } catch (Throwable th7) {
                CrashShieldHandler.a(ShareInternalUtility.class, th7);
                bundle = null;
            }
        }
        if (CrashShieldHandler.b(ShareInternalUtility.class) || (sharePhoto = shareStoryContent.i0) == null) {
            bundle2 = null;
        } else {
            try {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(sharePhoto);
                ArrayList arrayListI3 = Utility.I(arrayList7, new Utility.Mapper<SharePhoto, NativeAppCallAttachmentStore.Attachment>() { // from class: com.facebook.share.internal.ShareInternalUtility.9

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ UUID f16602a;

                    public AnonymousClass9() {
                        uuid = uuid;
                    }

                    @Override // com.facebook.internal.Utility.Mapper
                    public final Object apply(Object obj3) {
                        return ShareInternalUtility.a(uuid, (SharePhoto) obj3);
                    }
                });
                ArrayList arrayListI4 = Utility.I(arrayListI3, new ShareInternalUtility.AnonymousClass10());
                NativeAppCallAttachmentStore.a(arrayListI3);
                bundle2 = (Bundle) arrayListI4.get(0);
            } catch (Throwable th8) {
                CrashShieldHandler.a(ShareInternalUtility.class, th8);
                bundle2 = null;
            }
        }
        Bundle bundleB10 = b(shareStoryContent, false);
        if (bundle != null) {
            bundleB10.putParcelable("bg_asset", bundle);
        }
        if (bundle2 != null) {
            bundleB10.putParcelable("interactive_asset_uri", bundle2);
        }
        List list2 = shareStoryContent.j0;
        List listUnmodifiableList = list2 != null ? Collections.unmodifiableList(list2) : null;
        if (!Utility.D(listUnmodifiableList)) {
            bundleB10.putStringArrayList("top_background_color_list", new ArrayList<>(listUnmodifiableList));
        }
        Utility.O(bundleB10, "content_url", shareStoryContent.k0);
        return bundleB10;
    }

    public static Bundle b(ShareContent shareContent, boolean z2) {
        Bundle bundle = new Bundle();
        Uri uri = shareContent.X;
        if (uri != null) {
            Utility.O(bundle, "LINK", uri.toString());
        }
        Utility.O(bundle, "PLACE", shareContent.Z);
        Utility.O(bundle, "PAGE", shareContent.e0);
        Utility.O(bundle, "REF", shareContent.f0);
        bundle.putBoolean("DATA_FAILURES_FATAL", z2);
        List list = shareContent.f16612Y;
        if (!Utility.D(list)) {
            bundle.putStringArrayList("FRIENDS", new ArrayList<>(list));
        }
        ShareHashtag shareHashtag = shareContent.g0;
        if (shareHashtag != null) {
            Utility.O(bundle, "HASHTAG", shareHashtag.X);
        }
        return bundle;
    }
}
