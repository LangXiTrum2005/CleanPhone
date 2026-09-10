package com.facebook.share.internal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.p004ironsource.d9;
import com.smartdigimkt.o1.b;
import com.smartdigimkt.x.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareInternalUtility {

    /* JADX INFO: renamed from: com.facebook.share.internal.ShareInternalUtility$1, reason: invalid class name */
    final class AnonymousClass1 extends ResultProcessor {
        @Override // com.facebook.share.internal.ResultProcessor
        public final void a(AppCall appCall) {
            ShareInternalUtility.h();
        }

        @Override // com.facebook.share.internal.ResultProcessor
        public final void b(AppCall appCall, FacebookException facebookException) {
            ShareInternalUtility.i(facebookException);
        }

        @Override // com.facebook.share.internal.ResultProcessor
        public final void c(AppCall appCall, Bundle bundle) {
            if (bundle != null) {
                String strC = ShareInternalUtility.c(bundle);
                if (strC != null && !"post".equalsIgnoreCase(strC)) {
                    if (b.P3.equalsIgnoreCase(strC)) {
                        ShareInternalUtility.h();
                        return;
                    } else {
                        ShareInternalUtility.i(new FacebookException("UnknownError"));
                        return;
                    }
                }
                if (!CrashShieldHandler.b(ShareInternalUtility.class)) {
                    try {
                        if (bundle.containsKey("postId")) {
                            bundle.getString("postId");
                        } else if (bundle.containsKey("com.facebook.platform.extra.POST_ID")) {
                            bundle.getString("com.facebook.platform.extra.POST_ID");
                        } else {
                            bundle.getString("post_id");
                        }
                    } catch (Throwable th) {
                        CrashShieldHandler.a(ShareInternalUtility.class, th);
                    }
                }
                ShareInternalUtility.j();
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.internal.ShareInternalUtility$10, reason: invalid class name */
    final class AnonymousClass10 implements Utility.Mapper<NativeAppCallAttachmentStore.Attachment, Bundle> {
        @Override // com.facebook.internal.Utility.Mapper
        public final Object apply(Object obj) {
            NativeAppCallAttachmentStore.Attachment attachment = (NativeAppCallAttachmentStore.Attachment) obj;
            Bundle bundle = new Bundle();
            bundle.putString("uri", attachment.f16356a);
            String strE = ShareInternalUtility.e(attachment.g);
            if (strE != null) {
                Utility.O(bundle, "extension", strE);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.internal.ShareInternalUtility$3, reason: invalid class name */
    final class AnonymousClass3 implements CallbackManagerImpl.Callback {
        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public final boolean a(int i2, Intent intent) {
            AnonymousClass1 anonymousClass1 = null;
            if (!CrashShieldHandler.b(ShareInternalUtility.class)) {
                try {
                    anonymousClass1 = new AnonymousClass1();
                } catch (Throwable th) {
                    CrashShieldHandler.a(ShareInternalUtility.class, th);
                }
            }
            return ShareInternalUtility.f(0, intent, anonymousClass1);
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.internal.ShareInternalUtility$5, reason: invalid class name */
    final class AnonymousClass5 implements Utility.Mapper<NativeAppCallAttachmentStore.Attachment, String> {
        @Override // com.facebook.internal.Utility.Mapper
        public final Object apply(Object obj) {
            return ((NativeAppCallAttachmentStore.Attachment) obj).f16356a;
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.internal.ShareInternalUtility$8, reason: invalid class name */
    final class AnonymousClass8 implements OpenGraphJSONUtility.PhotoJSONProcessor {
        @Override // com.facebook.share.internal.OpenGraphJSONUtility.PhotoJSONProcessor
        public final JSONObject a(SharePhoto sharePhoto) {
            Uri uri = sharePhoto.Z;
            if (!Utility.E(uri)) {
                throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", uri.toString());
                return jSONObject;
            } catch (JSONException e2) {
                throw new FacebookException("Unable to attach images", e2);
            }
        }
    }

    public static NativeAppCallAttachmentStore.Attachment a(UUID callId, ShareMedia shareMedia) {
        Uri uri;
        Bitmap bitmap;
        NativeAppCallAttachmentStore.Attachment attachment = null;
        if (!CrashShieldHandler.b(ShareInternalUtility.class)) {
            try {
                if (!CrashShieldHandler.b(ShareInternalUtility.class)) {
                    try {
                        if (shareMedia instanceof SharePhoto) {
                            SharePhoto sharePhoto = (SharePhoto) shareMedia;
                            bitmap = sharePhoto.f16623Y;
                            uri = sharePhoto.Z;
                        } else if (shareMedia instanceof ShareVideo) {
                            uri = ((ShareVideo) shareMedia).f16627Y;
                            bitmap = null;
                        } else {
                            uri = null;
                            bitmap = null;
                        }
                        if (!CrashShieldHandler.b(ShareInternalUtility.class)) {
                            try {
                                if (bitmap != null) {
                                    Intrinsics.f(callId, "callId");
                                    attachment = new NativeAppCallAttachmentStore.Attachment(callId, bitmap, null);
                                } else if (uri != null) {
                                    Intrinsics.f(callId, "callId");
                                    attachment = new NativeAppCallAttachmentStore.Attachment(callId, null, uri);
                                }
                            } catch (Throwable th) {
                                CrashShieldHandler.a(ShareInternalUtility.class, th);
                            }
                        }
                    } catch (Throwable th2) {
                        CrashShieldHandler.a(ShareInternalUtility.class, th2);
                    }
                    return attachment;
                }
            } catch (Throwable th3) {
                CrashShieldHandler.a(ShareInternalUtility.class, th3);
                return attachment;
            }
        }
        return null;
    }

    public static Pair b(String str) {
        String strSubstring;
        int i2;
        if (CrashShieldHandler.b(ShareInternalUtility.class)) {
            return null;
        }
        try {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf == -1 || str.length() <= (i2 = iIndexOf + 1)) {
                strSubstring = null;
            } else {
                strSubstring = str.substring(0, iIndexOf);
                str = str.substring(i2);
            }
            return new Pair(strSubstring, str);
        } catch (Throwable th) {
            CrashShieldHandler.a(ShareInternalUtility.class, th);
            return null;
        }
    }

    public static String c(Bundle bundle) {
        if (CrashShieldHandler.b(ShareInternalUtility.class)) {
            return null;
        }
        try {
            return bundle.containsKey("completionGesture") ? bundle.getString("completionGesture") : bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
        } catch (Throwable th) {
            CrashShieldHandler.a(ShareInternalUtility.class, th);
            return null;
        }
    }

    public static ArrayList d(SharePhotoContent sharePhotoContent, final UUID uuid) {
        if (!CrashShieldHandler.b(ShareInternalUtility.class) && sharePhotoContent != null) {
            try {
                List list = sharePhotoContent.h0;
                if (list != null) {
                    ArrayList arrayListI = Utility.I(list, new Utility.Mapper<SharePhoto, NativeAppCallAttachmentStore.Attachment>() { // from class: com.facebook.share.internal.ShareInternalUtility.4
                        @Override // com.facebook.internal.Utility.Mapper
                        public final Object apply(Object obj) {
                            return ShareInternalUtility.a(uuid, (SharePhoto) obj);
                        }
                    });
                    ArrayList arrayListI2 = Utility.I(arrayListI, new AnonymousClass5());
                    NativeAppCallAttachmentStore.a(arrayListI);
                    return arrayListI2;
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(ShareInternalUtility.class, th);
            }
        }
        return null;
    }

    public static String e(Uri uri) {
        if (CrashShieldHandler.b(ShareInternalUtility.class) || uri == null) {
            return null;
        }
        try {
            String string = uri.toString();
            int iLastIndexOf = string.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                return null;
            }
            return string.substring(iLastIndexOf);
        } catch (Throwable th) {
            CrashShieldHandler.a(ShareInternalUtility.class, th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0029 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:5:0x000c, B:18:0x0029, B:20:0x0038, B:23:0x003f, B:38:0x006d, B:40:0x0073, B:42:0x0077, B:45:0x007d, B:46:0x0081, B:59:0x00aa, B:58:0x00a7, B:37:0x0069, B:15:0x0022, B:9:0x0015, B:12:0x001c, B:27:0x004b, B:30:0x0055, B:32:0x005b, B:35:0x0064, B:49:0x0088, B:53:0x009c), top: B:70:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:5:0x000c, B:18:0x0029, B:20:0x0038, B:23:0x003f, B:38:0x006d, B:40:0x0073, B:42:0x0077, B:45:0x007d, B:46:0x0081, B:59:0x00aa, B:58:0x00a7, B:37:0x0069, B:15:0x0022, B:9:0x0015, B:12:0x001c, B:27:0x004b, B:30:0x0055, B:32:0x005b, B:35:0x0064, B:49:0x0088, B:53:0x009c), top: B:70:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX WARN: Code duplicated, block: B:23:0x003f A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #3 {all -> 0x007b, blocks: (B:5:0x000c, B:18:0x0029, B:20:0x0038, B:23:0x003f, B:38:0x006d, B:40:0x0073, B:42:0x0077, B:45:0x007d, B:46:0x0081, B:59:0x00aa, B:58:0x00a7, B:37:0x0069, B:15:0x0022, B:9:0x0015, B:12:0x001c, B:27:0x004b, B:30:0x0055, B:32:0x005b, B:35:0x0064, B:49:0x0088, B:53:0x009c), top: B:70:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:27:0x004b, B:30:0x0055, B:32:0x005b, B:35:0x0064), top: B:66:0x004b, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:27:0x004b, B:30:0x0055, B:32:0x005b, B:35:0x0064), top: B:66:0x004b, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0064 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #1 {all -> 0x0062, blocks: (B:27:0x004b, B:30:0x0055, B:32:0x005b, B:35:0x0064), top: B:66:0x004b, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0073 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:5:0x000c, B:18:0x0029, B:20:0x0038, B:23:0x003f, B:38:0x006d, B:40:0x0073, B:42:0x0077, B:45:0x007d, B:46:0x0081, B:59:0x00aa, B:58:0x00a7, B:37:0x0069, B:15:0x0022, B:9:0x0015, B:12:0x001c, B:27:0x004b, B:30:0x0055, B:32:0x005b, B:35:0x0064, B:49:0x0088, B:53:0x009c), top: B:70:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0077 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:5:0x000c, B:18:0x0029, B:20:0x0038, B:23:0x003f, B:38:0x006d, B:40:0x0073, B:42:0x0077, B:45:0x007d, B:46:0x0081, B:59:0x00aa, B:58:0x00a7, B:37:0x0069, B:15:0x0022, B:9:0x0015, B:12:0x001c, B:27:0x004b, B:30:0x0055, B:32:0x005b, B:35:0x0064, B:49:0x0088, B:53:0x009c), top: B:70:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x007d A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:5:0x000c, B:18:0x0029, B:20:0x0038, B:23:0x003f, B:38:0x006d, B:40:0x0073, B:42:0x0077, B:45:0x007d, B:46:0x0081, B:59:0x00aa, B:58:0x00a7, B:37:0x0069, B:15:0x0022, B:9:0x0015, B:12:0x001c, B:27:0x004b, B:30:0x0055, B:32:0x005b, B:35:0x0064, B:49:0x0088, B:53:0x009c), top: B:70:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0081 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #3 {all -> 0x007b, blocks: (B:5:0x000c, B:18:0x0029, B:20:0x0038, B:23:0x003f, B:38:0x006d, B:40:0x0073, B:42:0x0077, B:45:0x007d, B:46:0x0081, B:59:0x00aa, B:58:0x00a7, B:37:0x0069, B:15:0x0022, B:9:0x0015, B:12:0x001c, B:27:0x004b, B:30:0x0055, B:32:0x005b, B:35:0x0064, B:49:0x0088, B:53:0x009c), top: B:70:0x000c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0069 -> B:26:0x0049). Please report as a decompilation issue!!! */
    public static boolean f(int i2, Intent resultIntent, ResultProcessor resultProcessor) {
        AppCall appCallA;
        File fileD;
        Bundle bundleI;
        Bundle extras;
        FacebookException facebookExceptionK;
        int iO;
        Bundle extras2;
        if (!CrashShieldHandler.b(ShareInternalUtility.class)) {
            try {
                Bundle bundle = null;
                if (CrashShieldHandler.b(ShareInternalUtility.class)) {
                    appCallA = null;
                    if (appCallA != null) {
                        UUID callId = appCallA.b();
                        Intrinsics.f(callId, "callId");
                        fileD = NativeAppCallAttachmentStore.d(callId, false);
                        if (fileD != null) {
                            Utility.k(fileD);
                        }
                        if (resultProcessor == null) {
                            return true;
                        }
                        ArrayList arrayList = NativeProtocol.f16360a;
                        if (CrashShieldHandler.b(NativeProtocol.class)) {
                            extras = null;
                        } else {
                            try {
                                Intrinsics.f(resultIntent, "resultIntent");
                                if (NativeProtocol.p(resultIntent)) {
                                    bundleI = NativeProtocol.i(resultIntent);
                                    if (bundleI != null) {
                                        extras = bundleI.getBundle("error");
                                    } else {
                                        extras = resultIntent.getExtras();
                                    }
                                } else {
                                    extras = null;
                                }
                            } catch (Throwable th) {
                                CrashShieldHandler.a(NativeProtocol.class, th);
                            }
                        }
                        facebookExceptionK = NativeProtocol.k(extras);
                        if (facebookExceptionK != null) {
                            if (facebookExceptionK instanceof FacebookOperationCanceledException) {
                                resultProcessor.a(appCallA);
                                return true;
                            }
                            resultProcessor.b(appCallA, facebookExceptionK);
                            return true;
                        }
                        if (!CrashShieldHandler.b(NativeProtocol.class)) {
                            try {
                                Intrinsics.f(resultIntent, "resultIntent");
                                iO = NativeProtocol.o(resultIntent);
                                extras2 = resultIntent.getExtras();
                                if (NativeProtocol.q(iO) || extras2 == null) {
                                    bundle = extras2;
                                } else {
                                    bundle = extras2.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
                                }
                            } catch (Throwable th2) {
                                CrashShieldHandler.a(NativeProtocol.class, th2);
                            }
                        }
                        resultProcessor.c(appCallA, bundle);
                        return true;
                    }
                } else {
                    try {
                        UUID uuidJ = NativeProtocol.j(resultIntent);
                        if (uuidJ != null) {
                            appCallA = AppCall.a(uuidJ, i2);
                            if (appCallA != null) {
                                UUID callId2 = appCallA.b();
                                Intrinsics.f(callId2, "callId");
                                fileD = NativeAppCallAttachmentStore.d(callId2, false);
                                if (fileD != null) {
                                    Utility.k(fileD);
                                }
                                if (resultProcessor == null) {
                                    return true;
                                }
                                ArrayList arrayList2 = NativeProtocol.f16360a;
                                if (CrashShieldHandler.b(NativeProtocol.class)) {
                                    extras = null;
                                } else {
                                    Intrinsics.f(resultIntent, "resultIntent");
                                    if (NativeProtocol.p(resultIntent)) {
                                        extras = null;
                                    } else {
                                        bundleI = NativeProtocol.i(resultIntent);
                                        if (bundleI != null) {
                                            extras = bundleI.getBundle("error");
                                        } else {
                                            extras = resultIntent.getExtras();
                                        }
                                    }
                                }
                                facebookExceptionK = NativeProtocol.k(extras);
                                if (facebookExceptionK != null) {
                                    if (facebookExceptionK instanceof FacebookOperationCanceledException) {
                                        resultProcessor.a(appCallA);
                                        return true;
                                    }
                                    resultProcessor.b(appCallA, facebookExceptionK);
                                    return true;
                                }
                                if (!CrashShieldHandler.b(NativeProtocol.class)) {
                                    Intrinsics.f(resultIntent, "resultIntent");
                                    iO = NativeProtocol.o(resultIntent);
                                    extras2 = resultIntent.getExtras();
                                    if (NativeProtocol.q(iO)) {
                                        bundle = extras2;
                                    } else {
                                        bundle = extras2;
                                    }
                                }
                                resultProcessor.c(appCallA, bundle);
                                return true;
                            }
                        }
                    } catch (Throwable th3) {
                        CrashShieldHandler.a(ShareInternalUtility.class, th3);
                    }
                    appCallA = null;
                    if (appCallA != null) {
                        UUID callId3 = appCallA.b();
                        Intrinsics.f(callId3, "callId");
                        fileD = NativeAppCallAttachmentStore.d(callId3, false);
                        if (fileD != null) {
                            Utility.k(fileD);
                        }
                        if (resultProcessor == null) {
                            return true;
                        }
                        ArrayList arrayList3 = NativeProtocol.f16360a;
                        if (CrashShieldHandler.b(NativeProtocol.class)) {
                            extras = null;
                        } else {
                            Intrinsics.f(resultIntent, "resultIntent");
                            if (NativeProtocol.p(resultIntent)) {
                                extras = null;
                            } else {
                                bundleI = NativeProtocol.i(resultIntent);
                                if (bundleI != null) {
                                    extras = bundleI.getBundle("error");
                                } else {
                                    extras = resultIntent.getExtras();
                                }
                            }
                        }
                        facebookExceptionK = NativeProtocol.k(extras);
                        if (facebookExceptionK != null) {
                            if (facebookExceptionK instanceof FacebookOperationCanceledException) {
                                resultProcessor.a(appCallA);
                                return true;
                            }
                            resultProcessor.b(appCallA, facebookExceptionK);
                            return true;
                        }
                        if (!CrashShieldHandler.b(NativeProtocol.class)) {
                            Intrinsics.f(resultIntent, "resultIntent");
                            iO = NativeProtocol.o(resultIntent);
                            extras2 = resultIntent.getExtras();
                            if (NativeProtocol.q(iO)) {
                                bundle = extras2;
                            } else {
                                bundle = extras2;
                            }
                        }
                        resultProcessor.c(appCallA, bundle);
                        return true;
                    }
                }
            } catch (Throwable th4) {
                CrashShieldHandler.a(ShareInternalUtility.class, th4);
                return false;
            }
        }
        return false;
    }

    public static void g(GraphResponse graphResponse) {
        if (CrashShieldHandler.b(ShareInternalUtility.class)) {
            return;
        }
        try {
            FacebookRequestError facebookRequestError = graphResponse.d;
            if (facebookRequestError == null) {
                j();
                return;
            }
            String strA = facebookRequestError.a();
            if (Utility.C(strA)) {
                strA = "Unexpected error sharing.";
            }
            if (CrashShieldHandler.b(ShareInternalUtility.class)) {
                return;
            }
            try {
                k("error", strA);
            } catch (Throwable th) {
                CrashShieldHandler.a(ShareInternalUtility.class, th);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.a(ShareInternalUtility.class, th2);
        }
    }

    public static void h() {
        if (CrashShieldHandler.b(ShareInternalUtility.class)) {
            return;
        }
        try {
            k("cancelled", null);
        } catch (Throwable th) {
            CrashShieldHandler.a(ShareInternalUtility.class, th);
        }
    }

    public static void i(FacebookException facebookException) {
        if (CrashShieldHandler.b(ShareInternalUtility.class)) {
            return;
        }
        try {
            k("error", facebookException.getMessage());
        } catch (Throwable th) {
            CrashShieldHandler.a(ShareInternalUtility.class, th);
        }
    }

    public static void j() {
        if (CrashShieldHandler.b(ShareInternalUtility.class)) {
            return;
        }
        try {
            k("succeeded", null);
        } catch (Throwable th) {
            CrashShieldHandler.a(ShareInternalUtility.class, th);
        }
    }

    public static void k(String str, String str2) {
        if (CrashShieldHandler.b(ShareInternalUtility.class)) {
            return;
        }
        try {
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(FacebookSdk.b());
            Bundle bundle = new Bundle();
            bundle.putString("fb_share_dialog_outcome", str);
            if (str2 != null) {
                bundle.putString("error_message", str2);
            }
            internalAppEventsLogger.d(bundle, "fb_share_dialog_result");
        } catch (Throwable th) {
            CrashShieldHandler.a(ShareInternalUtility.class, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    public static GraphRequest l(AccessToken accessToken, Uri uri, GraphRequest.Callback callback) {
        boolean z2;
        if (CrashShieldHandler.b(ShareInternalUtility.class)) {
            return null;
        }
        boolean z3 = false;
        if (uri != null) {
            try {
                if (d9.h.f24719b.equalsIgnoreCase(uri.getScheme())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(ShareInternalUtility.class, th);
                return null;
            }
        } else {
            z2 = false;
        }
        HttpMethod httpMethod = HttpMethod.f15953Y;
        if (!z2) {
            if (uri != null && "content".equalsIgnoreCase(uri.getScheme())) {
                z3 = true;
            }
            if (!z3) {
                throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
            }
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(uri);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable(d9.h.f24719b, parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, "me/staging_resources", bundle, httpMethod, callback);
        }
        File file = new File(uri.getPath());
        if (CrashShieldHandler.b(ShareInternalUtility.class)) {
            return null;
        }
        try {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType2 = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456));
            Bundle bundle2 = new Bundle(1);
            bundle2.putParcelable(d9.h.f24719b, parcelableResourceWithMimeType2);
            return new GraphRequest(accessToken, "me/staging_resources", bundle2, httpMethod, callback);
        } catch (Throwable th2) {
            CrashShieldHandler.a(ShareInternalUtility.class, th2);
            return null;
        }
    }

    public static void m(final int i2) {
        if (CrashShieldHandler.b(ShareInternalUtility.class)) {
            return;
        }
        try {
            CallbackManagerImpl.a(i2, new CallbackManagerImpl.Callback() { // from class: com.facebook.share.internal.ShareInternalUtility.2
                @Override // com.facebook.internal.CallbackManagerImpl.Callback
                public final boolean a(int i3, Intent intent) {
                    AnonymousClass1 anonymousClass1 = null;
                    if (!CrashShieldHandler.b(ShareInternalUtility.class)) {
                        try {
                            anonymousClass1 = new AnonymousClass1();
                        } catch (Throwable th) {
                            CrashShieldHandler.a(ShareInternalUtility.class, th);
                        }
                    }
                    return ShareInternalUtility.f(i2, intent, anonymousClass1);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.a(ShareInternalUtility.class, th);
        }
    }

    public static JSONArray n(JSONArray jSONArray) {
        if (CrashShieldHandler.b(ShareInternalUtility.class)) {
            return null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                Object objO = jSONArray.get(i2);
                if (objO instanceof JSONArray) {
                    objO = n((JSONArray) objO);
                } else if (objO instanceof JSONObject) {
                    objO = o((JSONObject) objO, true);
                }
                jSONArray2.put(objO);
            }
            return jSONArray2;
        } catch (Throwable th) {
            CrashShieldHandler.a(ShareInternalUtility.class, th);
            return null;
        }
    }

    public static JSONObject o(JSONObject jSONObject, boolean z2) {
        if (CrashShieldHandler.b(ShareInternalUtility.class) || jSONObject == null) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArrayNames = jSONObject.names();
                for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
                    String string = jSONArrayNames.getString(i2);
                    Object objN = jSONObject.get(string);
                    if (objN instanceof JSONObject) {
                        objN = o((JSONObject) objN, true);
                    } else if (objN instanceof JSONArray) {
                        objN = n((JSONArray) objN);
                    }
                    Pair pairB = b(string);
                    String str = (String) pairB.first;
                    String str2 = (String) pairB.second;
                    if (z2) {
                        if (str != null && str.equals("fbsdk")) {
                            jSONObject2.put(string, objN);
                        } else if (str == null || str.equals("og")) {
                            jSONObject2.put(str2, objN);
                        } else {
                            jSONObject3.put(str2, objN);
                        }
                    } else if (str == null || !str.equals(n.f39791p)) {
                        jSONObject2.put(str2, objN);
                    } else {
                        jSONObject2.put(string, objN);
                    }
                }
                if (jSONObject3.length() > 0) {
                    jSONObject2.put("data", jSONObject3);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                throw new FacebookException("Failed to create json object from share content");
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(ShareInternalUtility.class, th);
            return null;
        }
    }

    public static JSONObject p(final UUID uuid, ShareOpenGraphContent shareOpenGraphContent) {
        if (CrashShieldHandler.b(ShareInternalUtility.class)) {
            return null;
        }
        try {
            ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.h0;
            final ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectA = OpenGraphJSONUtility.a(shareOpenGraphAction, new OpenGraphJSONUtility.PhotoJSONProcessor() { // from class: com.facebook.share.internal.ShareInternalUtility.7
                @Override // com.facebook.share.internal.OpenGraphJSONUtility.PhotoJSONProcessor
                public final JSONObject a(SharePhoto sharePhoto) {
                    NativeAppCallAttachmentStore.Attachment attachmentA = ShareInternalUtility.a(uuid, sharePhoto);
                    if (attachmentA == null) {
                        return null;
                    }
                    arrayList.add(attachmentA);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("url", attachmentA.f16356a);
                        if (!sharePhoto.e0) {
                            return jSONObject;
                        }
                        jSONObject.put("user_generated", true);
                        return jSONObject;
                    } catch (JSONException e2) {
                        throw new FacebookException("Unable to attach images", e2);
                    }
                }
            });
            NativeAppCallAttachmentStore.a(arrayList);
            String str = shareOpenGraphContent.Z;
            if (str != null && Utility.C(jSONObjectA.optString("place"))) {
                jSONObjectA.put("place", str);
            }
            List list = shareOpenGraphContent.f16612Y;
            if (list != null) {
                JSONArray jSONArrayOptJSONArray = jSONObjectA.optJSONArray("tags");
                HashSet hashSet = jSONArrayOptJSONArray == null ? new HashSet() : Utility.F(jSONArrayOptJSONArray);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hashSet.add((String) it.next());
                }
                jSONObjectA.put("tags", new JSONArray((Collection) hashSet));
            }
            return jSONObjectA;
        } catch (Throwable th) {
            CrashShieldHandler.a(ShareInternalUtility.class, th);
            return null;
        }
    }

    public static JSONObject q(ShareOpenGraphContent shareOpenGraphContent) {
        if (CrashShieldHandler.b(ShareInternalUtility.class)) {
            return null;
        }
        try {
            return OpenGraphJSONUtility.a(shareOpenGraphContent.h0, new AnonymousClass8());
        } catch (Throwable th) {
            CrashShieldHandler.a(ShareInternalUtility.class, th);
            return null;
        }
    }
}
