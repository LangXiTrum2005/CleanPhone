package svd;

import ads_mobile_sdk.RtbAdapterData;
import android.os.Bundle;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.ironsource.Bc;
import com.ironsource.L6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nhl.ParentAdConfig;
import nhl.ParentCommonConfig;
import p002kotlin.Metadata;
import saneness.cybernatic;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 î\u00022\u00020\u0001:\u0002ï\u0002R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010(\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u0018\u0010*\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u0018\u0010,\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010\u0004R\u0018\u0010.\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010\u0013R\u0018\u00100\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u0010\u0013R\u0016\u00104\u001a\u0002018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u00103R*\u00106\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b5\u0010\nR\u0018\u00109\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0018\u0010?\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u00108R\u0018\u0010A\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b@\u00108R\u0018\u0010C\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bB\u00108R\u0018\u0010E\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u00108R\u0018\u0010G\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bF\u00108R\u0016\u0010I\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bH\u0010!R\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bN\u0010\u000eR\u0016\u0010Q\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bP\u0010\u000eR\u0018\u0010S\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bR\u0010\u0004R\u0018\u0010U\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bT\u0010\u0004R\u001e\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010V8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bW\u0010XR$\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010Z8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b^\u0010\u0004R\u0016\u0010a\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b`\u0010!R\u0018\u0010c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bb\u0010\u0004R\u0018\u0010e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bd\u0010\u0004R\u0016\u0010g\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bf\u0010\u0004R$\u0010i\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010\nR \u0010m\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020k0j8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010\\R\u0018\u0010o\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bn\u0010\u0013R$\u0010q\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bp\u0010\nR\u0014\u0010u\u001a\u00020r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010y\u001a\u0004\u0018\u00010v8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010{\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bz\u0010!R\u0016\u0010}\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b|\u0010\u000eR\u0016\u0010\u007f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b~\u0010\u000eR\u0018\u0010\u0081\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010!R\u001a\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u00108R\u001a\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u00108R\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010!R\u0018\u0010\u008d\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010!R\u0018\u0010\u008f\u0001\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010\u001dR\u0018\u0010\u0091\u0001\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010\u000eR\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0097\u0001\u001a\u0002018\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u00103R\u001a\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010\u0004R\u001c\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001a\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010\u0004R\u001a\u0010¡\u0001\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010LR\u001a\u0010¥\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001a\u0010§\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010\u0004R\u001a\u0010©\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010\u0004R\u001a\u0010«\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010\u0013R\u0018\u0010\u00ad\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010!R\u0018\u0010¯\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b®\u0001\u0010!R\u001a\u0010±\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b°\u0001\u0010\u0004R\u001a\u0010³\u0001\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b²\u0001\u00108R\u001a\u0010µ\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b´\u0001\u0010\u0004R\u001a\u0010·\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010\u0004R\u001a\u0010¹\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¸\u0001\u0010\u0004R\u0018\u0010»\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bº\u0001\u0010\u0004R\u001a\u0010½\u0001\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¼\u0001\u00108R\u001a\u0010¿\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¾\u0001\u0010\u0004R\u001a\u0010Á\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÀ\u0001\u0010\u0004R\u001a\u0010Ã\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÂ\u0001\u0010\u0004R\u001a\u0010Å\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÄ\u0001\u0010\u0004R\u001a\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÆ\u0001\u0010\u0004R1\u0010Î\u0001\u001a\f\u0012\u0005\u0012\u00030É\u0001\u0018\u00010È\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0005\b\u0003\u0010Ì\u0001\"\u0005\b\r\u0010Í\u0001R\u001a\u0010Ð\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÏ\u0001\u0010\u0004R\u001a\u0010Ò\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÑ\u0001\u0010\u0004R\u001a\u0010Ô\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÓ\u0001\u0010\u0004R\u001a\u0010Ö\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÕ\u0001\u0010\u0004R\u0018\u0010Ø\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b×\u0001\u0010\u0004R\u0016\u0010Ú\u0001\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bÙ\u0001\u0010\u000eR\u0018\u0010Ü\u0001\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÛ\u0001\u0010\u000eR\u001a\u0010Þ\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÝ\u0001\u0010\u0004R\u001a\u0010à\u0001\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bß\u0001\u00108R\u001a\u0010â\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bá\u0001\u0010\u0004R\u0018\u0010æ\u0001\u001a\u00030ã\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u001a\u0010è\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bç\u0001\u0010\u0013R\u001a\u0010ê\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bé\u0001\u0010\u0013R\u001a\u0010ì\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bë\u0001\u0010\u0004R\u001a\u0010î\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bí\u0001\u0010\u0004R\u001a\u0010ð\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bï\u0001\u0010\u0013R\u0018\u0010ò\u0001\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bñ\u0001\u0010\u000eR\u001a\u0010ô\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bó\u0001\u0010\u0004R&\u0010ö\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bõ\u0001\u0010\nR\u001a\u0010ø\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b÷\u0001\u0010\u0004R\u001a\u0010ú\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bù\u0001\u0010\u0004R\u001a\u0010ü\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bû\u0001\u0010\u0004R\u001a\u0010þ\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bý\u0001\u0010\u0013R\u001a\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÿ\u0001\u00108R\u001a\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0081\u0002\u0010\u0004R\u001a\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0083\u0002\u00108R\u001a\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0085\u0002\u00108R\u001a\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0087\u0002\u00108R\u001a\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0089\u0002\u0010\u0004R\u001a\u0010\u008c\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008b\u0002\u0010\u0013R\u001a\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008d\u0002\u0010\u0004R\u001c\u0010\u0092\u0002\u001a\u0005\u0018\u00010\u008f\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\u001c\u0010\u0094\u0002\u001a\u0005\u0018\u00010¢\u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0093\u0002\u0010¤\u0001R\u001a\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0095\u0002\u00108R\"\u0010\u0098\u0002\u001a\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010È\u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0097\u0002\u0010Ë\u0001R\"\u0010\u009a\u0002\u001a\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010È\u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0099\u0002\u0010Ë\u0001R\u001a\u0010\u009c\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009b\u0002\u0010\u0013R\u001a\u0010\u009e\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009d\u0002\u0010\u0004R\u001a\u0010 \u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009f\u0002\u0010\u0013R\u001a\u0010¢\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¡\u0002\u00108R\u001a\u0010¤\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b£\u0002\u0010\u0013R\u001c\u0010¨\u0002\u001a\u0005\u0018\u00010¥\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R\u001a\u0010ª\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b©\u0002\u0010\u0013R\u001a\u0010¬\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b«\u0002\u00108R\u001a\u0010®\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u00ad\u0002\u00108R\u001a\u0010°\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¯\u0002\u0010\u0004R\u001a\u0010²\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b±\u0002\u00108R\u0018\u0010´\u0002\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b³\u0002\u0010!R\u001a\u0010¶\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bµ\u0002\u0010\u0013R\u001a\u0010¸\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b·\u0002\u0010\u0013R\u001a\u0010º\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¹\u0002\u00108R\u001a\u0010¼\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b»\u0002\u0010\u0004R\u001a\u0010¾\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b½\u0002\u0010\u0013R\u001a\u0010À\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¿\u0002\u0010\u0004R\u001a\u0010Â\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÁ\u0002\u0010\u0004R\u001a\u0010Ä\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÃ\u0002\u0010\u0004R\u001a\u0010Æ\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÅ\u0002\u0010\u0013R\u001a\u0010È\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÇ\u0002\u00108R\u001a\u0010Ê\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÉ\u0002\u00108R&\u0010Ì\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010Z8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bË\u0002\u0010\\R\u001a\u0010Î\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÍ\u0002\u0010\u0013R\u001a\u0010Ð\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÏ\u0002\u00108R\u001a\u0010Ò\u0002\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÑ\u0002\u0010LR\u001c\u0010Ö\u0002\u001a\u0005\u0018\u00010Ó\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\bÔ\u0002\u0010Õ\u0002R&\u0010Ø\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010Z8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b×\u0002\u0010\\R\u001a\u0010Ú\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÙ\u0002\u00108R\u001c\u0010Þ\u0002\u001a\u0005\u0018\u00010Û\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\bÜ\u0002\u0010Ý\u0002R\u001c\u0010â\u0002\u001a\u0005\u0018\u00010ß\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\bà\u0002\u0010á\u0002R*\u0010è\u0002\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0006\bã\u0002\u0010ä\u0002\u001a\u0006\bå\u0002\u0010æ\u0002\"\u0005\b\t\u0010ç\u0002R*\u0010ê\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\bé\u0002\u00108\u001a\u0006\bê\u0002\u0010ë\u0002\"\u0006\bì\u0002\u0010í\u0002¨\u0006ð\u0002"}, d2 = {"Lsvd/arytenoidectomy;", "", "", "attabal", "Ljava/lang/String;", "adIdPermission", "Ljava/util/ArrayList;", "Lsvd/attabal;", "Lkotlin/collections/ArrayList;", "saneness", "Ljava/util/ArrayList;", "adSizeArray", "", "dern", "Z", "isGreaterThanMaxAllowedBannerSize", "wireman", "responsiveAutoFormat", "marial", "Ljava/lang/Boolean;", "adaptiveSlot", "beachfront", "format", "competently", "fluidType", "impromptu", "multipleAdSizeString", "", "taiyuan", "F", "screenDensity", "", "cutely", "I", "screenWidth", "apical", "screenHeight", "formularize", "screenWidthDip", "impassible", "screenHeightDip", "triweekly", "orientation", "kowloon", "adUnitId", "arytenoidectomy", "isRewarded", "monoploid", "isRewardedInterstitial", "", "polloi", "J", "requestTimeMilliseconds", "molybdenite", "keywords", "graveside", "Ljava/lang/Integer;", "safeAreaMarginLeftDip", "adultoid", "safeAreaMarginTopDip", "dovishness", "safeAreaMarginRightDip", "gintrap", "safeAreaMarginBottomDip", "rotuma", "roundedCornerTopLeftDip", "preprohormone", "roundedCornerTopRightDip", "cord", "roundedCornerBottomLeftDip", "cuirassed", "roundedCornerBottomRightDip", "stratoscope", "tagForChildDirectedTreatment", "Lcom/google/gson/JsonObject;", "trm", "Lcom/google/gson/JsonObject;", "csrbEcoData", "oilcan", "isTestRequest", "yemenite", "manualImpressionsEnabled", "sealless", "publisherProvidedId", "kattegat", "contentUrl", "", "supplicat", "Ljava/util/Set;", "neighboringContentUrls", "", "restrictive", "Ljava/util/Map;", "customTargeting", "merc", "requestAgent", "polder", "tagForUnderAgeOfConsent", "seminary", "maxAdContentRating", "grimness", "adResponseEncryptionKey", "saran", "adShieldSignal", "privatdozent", "adTypes", "", "Lsvd/dern;", "creditor", "adapterVersionData", "starveling", "appSwitched", "hydrovane", "grantedPermissions", "Lsvd/formularize;", "walach", "Lsvd/formularize;", "personallyIdentifiableInformation", "Lsvd/triweekly;", "peridotite", "Lsvd/triweekly;", "qualitySignals", "mathsort", "audioMode", "splinterproof", "isMusicActive", "overspeculate", "isSpeakerPhoneOn", "clubfoot", "musicVolume", "dent", "minMusicVolume", "permissivist", "maxMusicVolume", "", "cultivated", "Ljava/lang/Double;", "musicVolumePercent", "premeiotic", "ringerMode", "timberyard", "ringerVolume", "milliradian", "appVolume", "treadless", "isAppMuted", "Lsvd/impromptu;", "itchy", "Lsvd/impromptu;", "deviceSignals", "coffeecake", "timeSinceCldUpdate", "lerp", "adUnitRequestSignals", "Lcom/google/gson/JsonArray;", "nosophobia", "Lcom/google/gson/JsonArray;", "adUnitRequestSignalsObject", "lotta", "commonCldSignals", "sayid", "commonCldSignalsObject", "Landroid/os/Bundle;", "empress", "Landroid/os/Bundle;", "sharedPreferenceSignals", "coi", "creativeToken", "czestochowa", "debugSignalsEnabled", "sensatory", "shouldCollectAdResponseLogs", "underbelly", "testMode", "preterite", "linkedDevice", "wostteth", "inspectorExtras", "igbo", "requestServerData", "gusty", Bc.g, "picketboat", "clientOmidVersion", "palmyra", Bc.h, "lightstruck", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "monroe", "versionCode", "julian", "appName", "achondroplasia", "versionName", "unconsolidated", "displayLabel", "claque", "requestId", "hardpan", "realTimeBiddingSignals", "", "Lads_mobile_sdk/aj2;", "herdbook", "Ljava/util/List;", "()Ljava/util/List;", "(Ljava/util/List;)V", "realTimeBiddingSignalsObject", "technofreak", "gmpAppId", "outmarry", "appInstanceId", "dhss", "adEventId", "vesuvio", "appIdOrigin", "setterwort", "afmaVersion", "mastfed", "isNonagon", "attendance", "isDecagon", "homozygous", "additionalCapabilities", "lampshade", "targetApi", "libyan", "granularVersion", "Lsvd/kowloon;", "deadwork", "Lsvd/kowloon;", "sdkEnvironment", "molet", "canOpenGeo", "sakeen", "canOpenHttp", "immediately", "countryCode", "basify", "deviceCountryCode", "tectonization", "isEmulator", "prefect", "isLatchskyDevice", "osteal", "languageCode", "licking", "languageCodeList", "microchemistry", "deviceLanguageCode", "fastrack", "marketVersion", "cosy", "submodel", "pruinose", "isBattlestarDevice", "tarboosh", "buildApiLevel", "cig", "carrierCode", "demilitarize", "networkTypeCoarse", "sultanate", "networkTypeFine", "linendraper", X3.j.S, "stupefactive", "experimentIds", "libya", "transparentBackgroundSupported", "decarock", JsonStorageKeyNames.SESSION_ID_KEY, "Lsvd/saneness;", "tailoring", "Lsvd/saneness;", "adUnitQualitySignals", "liable", "googleExtrasBundle", "vir", "nativeVersion", "twybill", "nativeTemplates", "miliaria", "nativeCustomTemplates", "incorrectly", "enableNativeMediaOrientation", "hyalinization", "nativeMediaOrientation", "puffin", "customMuteThisAdRequested", "ctenidium", "customClickGestureDirection", "rajahship", "customClickGestureAllowTaps", "Lsvd/monoploid;", "tout", "Lsvd/monoploid;", "videoOptionsSignal", "undecorated", "isImageLoadingDisabled", "ethene", "adChoicesPlacement", "microanalysis", "numberOfRegisteredWebViews", "hydromechanics", "topics", "polyfoil", "topicsApiStatus", "bluecoat", "adServicesExtensionVersion", "harlequinade", "isBannerRefreshRequest", "cybernatic", "isIconAdRequest", "collection", "iconAdPlacement", "likeable", "correlator", "homophylic", "usesMediaView", "genii", "installerPackage", "saccharic", "initiatorPackage", "alloy", "signalType", "palewise", "isScarRequest", "livable", "publisherPrivacyPersonalizationState", "nomenclative", "isHsdpSupported", "hypokinesis", "preProcessedSignals", "murrine", "isPrefetchRequest", "untruth", "displayCount", "imparkation", "localSignals", "Lnhl/attabal;", "brighton", "Lnhl/attabal;", "parentAdConfig", "infiltration", "inMemorySdkCoreData", "polliwog", "numberOfAdsRequested", "Lsvd/competently;", "balance", "Lsvd/competently;", "clientRequestBuildingData", "Lnhl/saneness;", "nattier", "Lnhl/saneness;", "parentCommonConfig", "bavaria", "Ljava/lang/Long;", "getTimeSinceSdkInitMs", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "timeSinceSdkInitMs", "bleacherite", "isS2SRecursiveRequest", "()Ljava/lang/Integer;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Ljava/lang/Integer;)V", "strother", "ads_mobile_sdk/ct2", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class arytenoidectomy {

    /* JADX INFO: renamed from: strother, reason: collision with root package name */
    public static final cybernatic f38323strother = new cybernatic();

    /* JADX INFO: renamed from: achondroplasia, reason: collision with root package name and from kotlin metadata */
    @SerializedName("vnm")
    public String versionName;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sam_t")
    public Integer safeAreaMarginTopDip;

    /* JADX INFO: renamed from: alloy, reason: collision with root package name and from kotlin metadata */
    @SerializedName("signal_type")
    public String signalType;

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    @SerializedName(b.JSON_KEY_SH)
    public int screenHeight;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rbv")
    public Boolean isRewarded;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    @SerializedName("adid_p")
    public String adIdPermission;

    /* JADX INFO: renamed from: attendance, reason: collision with root package name and from kotlin metadata */
    @SerializedName("is_decagon")
    public boolean isDecagon;

    /* JADX INFO: renamed from: balance, reason: collision with root package name and from kotlin metadata */
    @SerializedName("csrb_output")
    public ClientRequestBuildingData clientRequestBuildingData;

    /* JADX INFO: renamed from: basify, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dgl")
    public String deviceCountryCode;

    /* JADX INFO: renamed from: bavaria, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tsi")
    private Long timeSinceSdkInitMs;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    @SerializedName("format")
    public String format;

    /* JADX INFO: renamed from: bleacherite, reason: collision with root package name and from kotlin metadata */
    @SerializedName("s2s_rr")
    private Integer isS2SRecursiveRequest;

    /* JADX INFO: renamed from: bluecoat, reason: collision with root package name and from kotlin metadata */
    @SerializedName("aos")
    public int adServicesExtensionVersion;

    /* JADX INFO: renamed from: brighton, reason: collision with root package name and from kotlin metadata */
    @SerializedName("parent_ad_config")
    public ParentAdConfig parentAdConfig;

    /* JADX INFO: renamed from: cig, reason: collision with root package name and from kotlin metadata */
    @SerializedName(L6.Q0)
    public String carrierCode;

    /* JADX INFO: renamed from: claque, reason: collision with root package name and from kotlin metadata */
    @SerializedName("request_id")
    public String requestId;

    /* JADX INFO: renamed from: clubfoot, reason: collision with root package name and from kotlin metadata */
    @SerializedName("muv")
    public int musicVolume;

    /* JADX INFO: renamed from: coffeecake, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cldut")
    public long timeSinceCldUpdate;

    /* JADX INFO: renamed from: coi, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gct")
    public String creativeToken;

    /* JADX INFO: renamed from: collection, reason: collision with root package name and from kotlin metadata */
    @SerializedName("iconad_placement")
    public Integer iconAdPlacement;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fluid")
    public String fluidType;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rc_bl")
    public Integer roundedCornerBottomLeftDip;

    /* JADX INFO: renamed from: cosy, reason: collision with root package name and from kotlin metadata */
    @SerializedName("submodel")
    public String submodel;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name and from kotlin metadata */
    @SerializedName("installed_adapter_data")
    public final Map<String, AdapterVersionData> adapterVersionData;

    /* JADX INFO: renamed from: ctenidium, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sccg_dir")
    public Integer customClickGestureDirection;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rc_br")
    public Integer roundedCornerBottomRightDip;

    /* JADX INFO: renamed from: cultivated, reason: collision with root package name and from kotlin metadata */
    @SerializedName("muv_percent")
    public Double musicVolumePercent;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sw")
    public int screenWidth;

    /* JADX INFO: renamed from: cybernatic, reason: collision with root package name and from kotlin metadata */
    @SerializedName("iconad")
    public Boolean isIconAdRequest;

    /* JADX INFO: renamed from: czestochowa, reason: collision with root package name and from kotlin metadata */
    @SerializedName(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)
    public String debugSignalsEnabled;

    /* JADX INFO: renamed from: deadwork, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sdk_env")
    public final SdkEnvironment sdkEnvironment;

    /* JADX INFO: renamed from: decarock, reason: collision with root package name and from kotlin metadata */
    @SerializedName("session_id")
    public String sessionId;

    /* JADX INFO: renamed from: demilitarize, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cnt")
    public Integer networkTypeCoarse;

    /* JADX INFO: renamed from: dent, reason: collision with root package name and from kotlin metadata */
    @SerializedName("muv_min")
    public Integer minMusicVolume;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    @SerializedName("is_greater_than_max_allowed_banner_size")
    public boolean isGreaterThanMaxAllowedBannerSize;

    /* JADX INFO: renamed from: dhss, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fbs_aeid")
    public String adEventId;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sam_r")
    public Integer safeAreaMarginRightDip;

    /* JADX INFO: renamed from: empress, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shared_pref")
    public Bundle sharedPreferenceSignals;

    /* JADX INFO: renamed from: ethene, reason: collision with root package name and from kotlin metadata */
    @SerializedName("preferred_ad_choices_position")
    public Integer adChoicesPlacement;

    /* JADX INFO: renamed from: fastrack, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mv")
    public String marketVersion;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    @SerializedName("u_w")
    public int screenWidthDip;

    /* JADX INFO: renamed from: genii, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ins_pn")
    public String installerPackage;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sam_b")
    public Integer safeAreaMarginBottomDip;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sam_l")
    public Integer safeAreaMarginLeftDip;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name and from kotlin metadata */
    @SerializedName("arek")
    public String adResponseEncryptionKey;

    /* JADX INFO: renamed from: gusty, reason: collision with root package name and from kotlin metadata */
    @SerializedName("omid_v")
    public String omidVersion;

    /* JADX INFO: renamed from: hardpan, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rtb")
    public String realTimeBiddingSignals;

    /* JADX INFO: renamed from: harlequinade, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ibrr")
    public Boolean isBannerRefreshRequest;

    /* JADX INFO: renamed from: herdbook, reason: collision with root package name and from kotlin metadata */
    public List<RtbAdapterData> realTimeBiddingSignalsObject;

    /* JADX INFO: renamed from: homophylic, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uses_media_view")
    public Boolean usesMediaView;

    /* JADX INFO: renamed from: homozygous, reason: collision with root package name and from kotlin metadata */
    @SerializedName("extra_caps")
    public String additionalCapabilities;

    /* JADX INFO: renamed from: hyalinization, reason: collision with root package name and from kotlin metadata */
    @SerializedName("native_media_orientation")
    public String nativeMediaOrientation;

    /* JADX INFO: renamed from: hydromechanics, reason: collision with root package name and from kotlin metadata */
    @SerializedName("topics")
    public String topics;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name and from kotlin metadata */
    @SerializedName("android_permissions")
    public final ArrayList<String> grantedPermissions;

    /* JADX INFO: renamed from: hypokinesis, reason: collision with root package name and from kotlin metadata */
    @SerializedName("p_signals")
    public Map<String, String> preProcessedSignals;

    /* JADX INFO: renamed from: igbo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("risd")
    public Integer requestServerData;

    /* JADX INFO: renamed from: immediately, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gl")
    public String countryCode;

    /* JADX INFO: renamed from: imparkation, reason: collision with root package name and from kotlin metadata */
    @SerializedName("l_signals")
    public JsonObject localSignals;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    @SerializedName("u_h")
    public int screenHeightDip;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sz")
    public String multipleAdSizeString;

    /* JADX INFO: renamed from: incorrectly, reason: collision with root package name and from kotlin metadata */
    @SerializedName("enable_native_media_orientation")
    public Boolean enableNativeMediaOrientation;

    /* JADX INFO: renamed from: infiltration, reason: collision with root package name and from kotlin metadata */
    @SerializedName("m_state")
    public Map<String, String> inMemorySdkCoreData;

    /* JADX INFO: renamed from: itchy, reason: collision with root package name and from kotlin metadata */
    @SerializedName(X3.i.G)
    public final DeviceSignals deviceSignals;

    /* JADX INFO: renamed from: julian, reason: collision with root package name and from kotlin metadata */
    @SerializedName("an")
    public String appName;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    @SerializedName("url")
    public String contentUrl;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    @SerializedName("slotname")
    public String adUnitId;

    /* JADX INFO: renamed from: lampshade, reason: collision with root package name and from kotlin metadata */
    @SerializedName("target_api")
    public Integer targetApi;

    /* JADX INFO: renamed from: lerp, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fwd_cld")
    public String adUnitRequestSignals;

    /* JADX INFO: renamed from: liable, reason: collision with root package name and from kotlin metadata */
    @SerializedName(HandleInvocationsFromAdViewer.KEY_EXTRAS)
    public Bundle googleExtrasBundle;

    /* JADX INFO: renamed from: libya, reason: collision with root package name and from kotlin metadata */
    @SerializedName("support_transparent_background")
    public Boolean transparentBackgroundSupported;

    /* JADX INFO: renamed from: libyan, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ev")
    public String granularVersion;

    /* JADX INFO: renamed from: licking, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hl_list")
    public final ArrayList<String> languageCodeList;

    /* JADX INFO: renamed from: lightstruck, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pn")
    public String packageName;

    /* JADX INFO: renamed from: likeable, reason: collision with root package name and from kotlin metadata */
    @SerializedName("correlation_id")
    public String correlator;

    /* JADX INFO: renamed from: linendraper, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pt")
    public Integer phoneType;

    /* JADX INFO: renamed from: livable, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ppt_p13n")
    public Integer publisherPrivacyPersonalizationState;

    /* JADX INFO: renamed from: lotta, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fwd_common_cld")
    public String commonCldSignals;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inline_adaptive_slot")
    public Boolean adaptiveSlot;

    /* JADX INFO: renamed from: mastfed, reason: collision with root package name and from kotlin metadata */
    @SerializedName("is_nonagon")
    public final boolean isNonagon;

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name and from kotlin metadata */
    @SerializedName("am")
    public int audioMode;

    /* JADX INFO: renamed from: merc, reason: collision with root package name and from kotlin metadata */
    @SerializedName("request_agent")
    public String requestAgent;

    /* JADX INFO: renamed from: microanalysis, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nrwv")
    public Integer numberOfRegisteredWebViews;

    /* JADX INFO: renamed from: microchemistry, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dlc")
    public String deviceLanguageCode;

    /* JADX INFO: renamed from: miliaria, reason: collision with root package name and from kotlin metadata */
    @SerializedName("native_custom_templates")
    public List<String> nativeCustomTemplates;

    /* JADX INFO: renamed from: milliradian, reason: collision with root package name and from kotlin metadata */
    @SerializedName("android_app_volume")
    public float appVolume;

    /* JADX INFO: renamed from: molet, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cog")
    public Boolean canOpenGeo;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    @SerializedName("kw")
    public ArrayList<String> keywords;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rbi")
    public Boolean isRewardedInterstitial;

    /* JADX INFO: renamed from: monroe, reason: collision with root package name and from kotlin metadata */
    @SerializedName("vc")
    public Integer versionCode;

    /* JADX INFO: renamed from: murrine, reason: collision with root package name and from kotlin metadata */
    @SerializedName("is_sdk_preload")
    public Boolean isPrefetchRequest;

    /* JADX INFO: renamed from: nattier, reason: collision with root package name and from kotlin metadata */
    @SerializedName("parent_common_config")
    public ParentCommonConfig parentCommonConfig;

    /* JADX INFO: renamed from: nomenclative, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lft")
    public Integer isHsdpSupported;

    /* JADX INFO: renamed from: nosophobia, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fwd_cld_obj")
    public JsonArray adUnitRequestSignalsObject;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    @SerializedName("test_request")
    public boolean isTestRequest;

    /* JADX INFO: renamed from: osteal, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hl")
    public String languageCode;

    /* JADX INFO: renamed from: outmarry, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fbs_aiid")
    public String appInstanceId;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sp")
    public boolean isSpeakerPhoneOn;

    /* JADX INFO: renamed from: palewise, reason: collision with root package name and from kotlin metadata */
    @SerializedName("scar")
    public Boolean isScarRequest;

    /* JADX INFO: renamed from: palmyra, reason: collision with root package name and from kotlin metadata */
    @SerializedName("client_omid_p")
    public String omidPartnerName;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name and from kotlin metadata */
    @SerializedName("quality_signals")
    public QualitySignals qualitySignals;

    /* JADX INFO: renamed from: permissivist, reason: collision with root package name and from kotlin metadata */
    @SerializedName("muv_max")
    public Integer maxMusicVolume;

    /* JADX INFO: renamed from: picketboat, reason: collision with root package name and from kotlin metadata */
    @SerializedName("client_omid_v")
    public String clientOmidVersion;

    /* JADX INFO: renamed from: polder, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tag_for_under_age_of_consent")
    public int tagForUnderAgeOfConsent;

    /* JADX INFO: renamed from: polliwog, reason: collision with root package name and from kotlin metadata */
    @SerializedName("max_num_ads")
    public Integer numberOfAdsRequested;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    @SerializedName("start_signals_timestamp")
    public long requestTimeMilliseconds;

    /* JADX INFO: renamed from: polyfoil, reason: collision with root package name and from kotlin metadata */
    @SerializedName("atps")
    public Integer topicsApiStatus;

    /* JADX INFO: renamed from: prefect, reason: collision with root package name and from kotlin metadata */
    @SerializedName("is_latchsky")
    public boolean isLatchskyDevice;

    /* JADX INFO: renamed from: premeiotic, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rm")
    public int ringerMode;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rc_tr")
    public Integer roundedCornerTopRightDip;

    /* JADX INFO: renamed from: preterite, reason: collision with root package name and from kotlin metadata */
    @SerializedName("linked_device")
    public int linkedDevice;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ad_types")
    public final ArrayList<String> adTypes;

    /* JADX INFO: renamed from: pruinose, reason: collision with root package name and from kotlin metadata */
    @SerializedName("is_bstar")
    public Boolean isBattlestarDevice;

    /* JADX INFO: renamed from: puffin, reason: collision with root package name and from kotlin metadata */
    @SerializedName("use_custom_mute")
    public Boolean customMuteThisAdRequested;

    /* JADX INFO: renamed from: rajahship, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sccg_tap")
    public Boolean customClickGestureAllowTaps;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    @SerializedName("custom_targeting")
    public Map<String, String> customTargeting;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rc_tl")
    public Integer roundedCornerTopLeftDip;

    /* JADX INFO: renamed from: saccharic, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ini_pn")
    public String initiatorPackage;

    /* JADX INFO: renamed from: sakeen, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coh")
    public Boolean canOpenHttp;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    @SerializedName("valid_ad_sizes")
    public final ArrayList<AdSizeBundle> adSizeArray;

    /* JADX INFO: renamed from: saran, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ms")
    public String adShieldSignal;

    /* JADX INFO: renamed from: sayid, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fwd_common_cld_obj")
    public JsonObject commonCldSignalsObject;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ppid")
    public String publisherProvidedId;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name and from kotlin metadata */
    @SerializedName("max_ad_content_rating")
    public String maxAdContentRating;

    /* JADX INFO: renamed from: sensatory, reason: collision with root package name and from kotlin metadata */
    @SerializedName("collect_response_logs")
    public Boolean shouldCollectAdResponseLogs;

    /* JADX INFO: renamed from: setterwort, reason: collision with root package name and from kotlin metadata */
    @SerializedName("js")
    public String afmaVersion;

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ma")
    public boolean isMusicActive;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name and from kotlin metadata */
    @SerializedName("app_switched")
    public Boolean appSwitched;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tag_for_child_directed_treatment")
    public int tagForChildDirectedTreatment;

    /* JADX INFO: renamed from: stupefactive, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eid")
    public String experimentIds;

    /* JADX INFO: renamed from: sultanate, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gnt")
    public Integer networkTypeFine;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    @SerializedName("neighboring_content_urls")
    public Set<String> neighboringContentUrls;

    /* JADX INFO: renamed from: tailoring, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ad_unit_quality_signals")
    public AdUnitQualitySignals adUnitQualitySignals;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    @SerializedName("u_sd")
    public float screenDensity;

    /* JADX INFO: renamed from: tarboosh, reason: collision with root package name and from kotlin metadata */
    @SerializedName("build_api_level")
    public Integer buildApiLevel;

    /* JADX INFO: renamed from: technofreak, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gmp_app_id")
    public String gmpAppId;

    /* JADX INFO: renamed from: tectonization, reason: collision with root package name and from kotlin metadata */
    @SerializedName("simulator")
    public Boolean isEmulator;

    /* JADX INFO: renamed from: timberyard, reason: collision with root package name and from kotlin metadata */
    @SerializedName("riv")
    public int ringerVolume;

    /* JADX INFO: renamed from: tout, reason: collision with root package name and from kotlin metadata */
    @SerializedName("video")
    public VideoOptionsSignal videoOptionsSignal;

    /* JADX INFO: renamed from: treadless, reason: collision with root package name and from kotlin metadata */
    @SerializedName("android_app_muted")
    public boolean isAppMuted;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    @SerializedName("u_so")
    public String orientation;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eco")
    public JsonObject csrbEcoData;

    /* JADX INFO: renamed from: twybill, reason: collision with root package name and from kotlin metadata */
    @SerializedName("native_templates")
    public List<String> nativeTemplates;

    /* JADX INFO: renamed from: unconsolidated, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dl")
    public String displayLabel;

    /* JADX INFO: renamed from: undecorated, reason: collision with root package name and from kotlin metadata */
    @SerializedName("disable_image_loading")
    public Boolean isImageLoadingDisabled;

    /* JADX INFO: renamed from: underbelly, reason: collision with root package name and from kotlin metadata */
    @SerializedName("test_mode")
    public int testMode;

    /* JADX INFO: renamed from: untruth, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dspct")
    public Integer displayCount;

    /* JADX INFO: renamed from: vesuvio, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apm_id_origin")
    public String appIdOrigin;

    /* JADX INFO: renamed from: vir, reason: collision with root package name and from kotlin metadata */
    @SerializedName("native_version")
    public Integer nativeVersion;

    /* JADX INFO: renamed from: walach, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pii")
    public final PersonallyIdentifiableInformation personallyIdentifiableInformation;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rafmt")
    public String responsiveAutoFormat;

    /* JADX INFO: renamed from: wostteth, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inspector_extras")
    public String inspectorExtras;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    @SerializedName("d_imp_hdr")
    public boolean manualImpressionsEnabled;

    public arytenoidectomy(String str, ArrayList arrayList, boolean z, String str2, Boolean bool, String str3, String str4, String str5, float f, int i, int i2, int i3, int i4, String str6, String str7, Boolean bool2, Boolean bool3, long j, ArrayList arrayList2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, int i5, JsonObject jsonObject, boolean z2, boolean z3, String str8, String str9, Set set, Map map, String str10, int i6, String str11, String str12, String str13, ArrayList arrayList3, Map map2, Boolean bool4, ArrayList arrayList4, PersonallyIdentifiableInformation personallyIdentifiableInformation, QualitySignals qualitySignals, int i7, boolean z4, boolean z5, int i8, Integer num9, Integer num10, Double d, int i9, int i10, float f2, boolean z6, DeviceSignals impromptuVar, long j2, String str14, JsonArray jsonArray, String str15, JsonObject jsonObject2, Bundle bundle, String str16, String str17, Boolean bool5, int i11, int i12, String str18, Integer num11, String str19, String str20, String str21, String str22, Integer num12, String str23, String str24, String str25, String str26, String str27, List list, String str28, String str29, String str30, String str31, String str32, boolean z7, boolean z8, String str33, Integer num13, String str34, SdkEnvironment sdkEnvironment, Boolean bool6, Boolean bool7, String str35, String str36, Boolean bool8, boolean z9, String str37, ArrayList arrayList5, String str38, String str39, String str40, Boolean bool9, Integer num14, String str41, Integer num15, Integer num16, Integer num17, String str42, Boolean bool10, String str43, AdUnitQualitySignals adUnitQualitySignals, Bundle bundle2, Integer num18, List list2, List list3, Boolean bool11, String str44, Boolean bool12, Integer num19, Boolean bool13, VideoOptionsSignal videoOptionsSignal, Boolean bool14, Integer num20, Integer num21, String str45, Integer num22, int i13, Boolean bool15, Boolean bool16, Integer num23, String str46, Boolean bool17, String str47, String str48, String str49, Boolean bool18, Integer num24, Integer num25, Map map3, Boolean bool19, Integer num26, JsonObject jsonObject3, ParentAdConfig attabalVar, Map map4, Integer num27, ClientRequestBuildingData competentlyVar, ParentCommonConfig sanenessVar, Long l, Integer num28) {
        this.adIdPermission = str;
        this.adSizeArray = arrayList;
        this.isGreaterThanMaxAllowedBannerSize = z;
        this.responsiveAutoFormat = str2;
        this.adaptiveSlot = bool;
        this.format = str3;
        this.fluidType = str4;
        this.multipleAdSizeString = str5;
        this.screenDensity = f;
        this.screenWidth = i;
        this.screenHeight = i2;
        this.screenWidthDip = i3;
        this.screenHeightDip = i4;
        this.orientation = str6;
        this.adUnitId = str7;
        this.isRewarded = bool2;
        this.isRewardedInterstitial = bool3;
        this.requestTimeMilliseconds = j;
        this.keywords = arrayList2;
        this.safeAreaMarginLeftDip = num;
        this.safeAreaMarginTopDip = num2;
        this.safeAreaMarginRightDip = num3;
        this.safeAreaMarginBottomDip = num4;
        this.roundedCornerTopLeftDip = num5;
        this.roundedCornerTopRightDip = num6;
        this.roundedCornerBottomLeftDip = num7;
        this.roundedCornerBottomRightDip = num8;
        this.tagForChildDirectedTreatment = i5;
        this.csrbEcoData = jsonObject;
        this.isTestRequest = z2;
        this.manualImpressionsEnabled = z3;
        this.publisherProvidedId = str8;
        this.contentUrl = str9;
        this.neighboringContentUrls = set;
        this.customTargeting = map;
        this.requestAgent = str10;
        this.tagForUnderAgeOfConsent = i6;
        this.maxAdContentRating = str11;
        this.adResponseEncryptionKey = str12;
        this.adShieldSignal = str13;
        this.adTypes = arrayList3;
        this.adapterVersionData = map2;
        this.appSwitched = bool4;
        this.grantedPermissions = arrayList4;
        this.personallyIdentifiableInformation = personallyIdentifiableInformation;
        this.qualitySignals = qualitySignals;
        this.audioMode = i7;
        this.isMusicActive = z4;
        this.isSpeakerPhoneOn = z5;
        this.musicVolume = i8;
        this.minMusicVolume = num9;
        this.maxMusicVolume = num10;
        this.musicVolumePercent = d;
        this.ringerMode = i9;
        this.ringerVolume = i10;
        this.appVolume = f2;
        this.isAppMuted = z6;
        this.deviceSignals = impromptuVar;
        this.timeSinceCldUpdate = j2;
        this.adUnitRequestSignals = str14;
        this.adUnitRequestSignalsObject = jsonArray;
        this.commonCldSignals = str15;
        this.commonCldSignalsObject = jsonObject2;
        this.sharedPreferenceSignals = bundle;
        this.creativeToken = str16;
        this.debugSignalsEnabled = str17;
        this.shouldCollectAdResponseLogs = bool5;
        this.testMode = i11;
        this.linkedDevice = i12;
        this.inspectorExtras = str18;
        this.requestServerData = num11;
        this.omidVersion = str19;
        this.clientOmidVersion = str20;
        this.omidPartnerName = str21;
        this.packageName = str22;
        this.versionCode = num12;
        this.appName = str23;
        this.versionName = str24;
        this.displayLabel = str25;
        this.requestId = str26;
        this.realTimeBiddingSignals = str27;
        this.realTimeBiddingSignalsObject = list;
        this.gmpAppId = str28;
        this.appInstanceId = str29;
        this.adEventId = str30;
        this.appIdOrigin = str31;
        this.afmaVersion = str32;
        this.isNonagon = z7;
        this.isDecagon = z8;
        this.additionalCapabilities = str33;
        this.targetApi = num13;
        this.granularVersion = str34;
        this.sdkEnvironment = sdkEnvironment;
        this.canOpenGeo = bool6;
        this.canOpenHttp = bool7;
        this.countryCode = str35;
        this.deviceCountryCode = str36;
        this.isEmulator = bool8;
        this.isLatchskyDevice = z9;
        this.languageCode = str37;
        this.languageCodeList = arrayList5;
        this.deviceLanguageCode = str38;
        this.marketVersion = str39;
        this.submodel = str40;
        this.isBattlestarDevice = bool9;
        this.buildApiLevel = num14;
        this.carrierCode = str41;
        this.networkTypeCoarse = num15;
        this.networkTypeFine = num16;
        this.phoneType = num17;
        this.experimentIds = str42;
        this.transparentBackgroundSupported = bool10;
        this.sessionId = str43;
        this.adUnitQualitySignals = adUnitQualitySignals;
        this.googleExtrasBundle = bundle2;
        this.nativeVersion = num18;
        this.nativeTemplates = list2;
        this.nativeCustomTemplates = list3;
        this.enableNativeMediaOrientation = bool11;
        this.nativeMediaOrientation = str44;
        this.customMuteThisAdRequested = bool12;
        this.customClickGestureDirection = num19;
        this.customClickGestureAllowTaps = bool13;
        this.videoOptionsSignal = videoOptionsSignal;
        this.isImageLoadingDisabled = bool14;
        this.adChoicesPlacement = num20;
        this.numberOfRegisteredWebViews = num21;
        this.topics = str45;
        this.topicsApiStatus = num22;
        this.adServicesExtensionVersion = i13;
        this.isBannerRefreshRequest = bool15;
        this.isIconAdRequest = bool16;
        this.iconAdPlacement = num23;
        this.correlator = str46;
        this.usesMediaView = bool17;
        this.installerPackage = str47;
        this.initiatorPackage = str48;
        this.signalType = str49;
        this.isScarRequest = bool18;
        this.publisherPrivacyPersonalizationState = num24;
        this.isHsdpSupported = num25;
        this.preProcessedSignals = map3;
        this.isPrefetchRequest = bool19;
        this.displayCount = num26;
        this.localSignals = jsonObject3;
        this.parentAdConfig = attabalVar;
        this.inMemorySdkCoreData = map4;
        this.numberOfAdsRequested = num27;
        this.clientRequestBuildingData = competentlyVar;
        this.parentCommonConfig = sanenessVar;
        this.timeSinceSdkInitMs = l;
        this.isS2SRecursiveRequest = num28;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final List getRealTimeBiddingSignalsObject() {
        return this.realTimeBiddingSignalsObject;
    }

    public final void dern(List list) {
        this.realTimeBiddingSignalsObject = list;
    }

    public final void saneness(Long l) {
        this.timeSinceSdkInitMs = l;
    }

    public final void wireman() {
        this.isS2SRecursiveRequest = 1;
    }

    public /* synthetic */ arytenoidectomy() {
        this("0", new ArrayList(), false, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 0, 0, null, "", null, null, 0L, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, null, 0, null, null, "", new ArrayList(), new LinkedHashMap(), null, new ArrayList(), new PersonallyIdentifiableInformation(0), null, 0, false, false, 0, null, null, null, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, new DeviceSignals(0), 0L, null, null, null, null, new Bundle(), null, null, null, 0, 0, null, null, null, null, null, "", null, null, null, null, null, null, null, null, null, null, null, "", false, true, null, null, null, new SdkEnvironment(0), null, null, null, null, null, false, null, new ArrayList(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
