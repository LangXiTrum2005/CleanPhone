package com.applovin.shadow.okio;

import an.a;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.B5;
import com.ironsource.D1;
import com.ironsource.X3;
import com.ironsource.Xa;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import d5.u;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l1.d;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002Ï\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001f\u0010 J'\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010!J\u001f\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\"J!\u0010#\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u001a¢\u0006\u0004\b&\u0010'J\u001d\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b&\u0010(J\r\u0010)\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0018\u00101\u001a\u00020+2\u0006\u0010.\u001a\u00020\u0011H\u0087\u0002¢\u0006\u0004\b/\u00100J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u0010*J\u000f\u00109\u001a\u000202H\u0016¢\u0006\u0004\b9\u00104J\u000f\u0010:\u001a\u000205H\u0016¢\u0006\u0004\b:\u00107J\u000f\u0010;\u001a\u00020\u0011H\u0016¢\u0006\u0004\b;\u0010*J\u000f\u0010<\u001a\u00020\u0011H\u0016¢\u0006\u0004\b<\u0010*J\u000f\u0010=\u001a\u00020\u0011H\u0016¢\u0006\u0004\b=\u0010*J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010?\u001a\u00020>2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b?\u0010AJ\u0017\u0010D\u001a\u0002052\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010G\u001a\u00020\u00132\u0006\u0010F\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u00112\u0006\u0010F\u001a\u00020IH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010M\u001a\u00020L2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bM\u0010OJ\u0017\u0010R\u001a\u00020L2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010R\u001a\u00020L2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010TJ\u0011\u0010U\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bU\u0010NJ\u000f\u0010V\u001a\u00020LH\u0016¢\u0006\u0004\bV\u0010NJ\u0017\u0010V\u001a\u00020L2\u0006\u0010W\u001a\u00020\u0011H\u0016¢\u0006\u0004\bV\u0010OJ\u000f\u0010X\u001a\u000205H\u0016¢\u0006\u0004\bX\u00107J\u000f\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010Z\u001a\u00020Y2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bZ\u0010\\J\u0017\u0010]\u001a\u0002052\u0006\u0010F\u001a\u00020YH\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010G\u001a\u00020\u00132\u0006\u0010F\u001a\u00020YH\u0016¢\u0006\u0004\bG\u0010_J'\u0010]\u001a\u0002052\u0006\u0010F\u001a\u00020Y2\u0006\u0010\u001e\u001a\u0002052\u0006\u0010\u0012\u001a\u000205H\u0016¢\u0006\u0004\b]\u0010`J\u0017\u0010]\u001a\u0002052\u0006\u0010F\u001a\u00020aH\u0016¢\u0006\u0004\b]\u0010bJ\r\u0010c\u001a\u00020\u0013¢\u0006\u0004\bc\u0010\u0006J\u0017\u0010d\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bd\u0010\u0015J\u0017\u0010f\u001a\u00020\u00002\u0006\u0010e\u001a\u00020>H\u0016¢\u0006\u0004\bf\u0010gJ'\u0010f\u001a\u00020\u00002\u0006\u0010e\u001a\u00020>2\u0006\u0010\u001e\u001a\u0002052\u0006\u0010\u0012\u001a\u000205H\u0016¢\u0006\u0004\bf\u0010hJ\u0017\u0010j\u001a\u00020\u00002\u0006\u0010i\u001a\u00020LH\u0016¢\u0006\u0004\bj\u0010kJ'\u0010j\u001a\u00020\u00002\u0006\u0010i\u001a\u00020L2\u0006\u0010l\u001a\u0002052\u0006\u0010m\u001a\u000205H\u0016¢\u0006\u0004\bj\u0010nJ\u0017\u0010p\u001a\u00020\u00002\u0006\u0010o\u001a\u000205H\u0016¢\u0006\u0004\bp\u0010qJ\u001f\u0010r\u001a\u00020\u00002\u0006\u0010i\u001a\u00020L2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\br\u0010sJ/\u0010r\u001a\u00020\u00002\u0006\u0010i\u001a\u00020L2\u0006\u0010l\u001a\u0002052\u0006\u0010m\u001a\u0002052\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\br\u0010tJ\u0017\u0010f\u001a\u00020\u00002\u0006\u0010u\u001a\u00020YH\u0016¢\u0006\u0004\bf\u0010vJ'\u0010f\u001a\u00020\u00002\u0006\u0010u\u001a\u00020Y2\u0006\u0010\u001e\u001a\u0002052\u0006\u0010\u0012\u001a\u000205H\u0016¢\u0006\u0004\bf\u0010wJ\u0017\u0010f\u001a\u0002052\u0006\u0010u\u001a\u00020aH\u0016¢\u0006\u0004\bf\u0010bJ\u0017\u0010y\u001a\u00020\u00112\u0006\u0010u\u001a\u00020xH\u0016¢\u0006\u0004\by\u0010zJ\u001f\u0010f\u001a\u00020\u00002\u0006\u0010u\u001a\u00020x2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bf\u0010{J\u0017\u0010}\u001a\u00020\u00002\u0006\u0010|\u001a\u000205H\u0016¢\u0006\u0004\b}\u0010qJ\u0017\u0010\u007f\u001a\u00020\u00002\u0006\u0010~\u001a\u000205H\u0016¢\u0006\u0004\b\u007f\u0010qJ\u0019\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u000205H\u0016¢\u0006\u0005\b\u0080\u0001\u0010qJ\u001a\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u000205H\u0016¢\u0006\u0005\b\u0082\u0001\u0010qJ\u001a\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u000205H\u0016¢\u0006\u0005\b\u0083\u0001\u0010qJ\u001b\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0086\u0001J\u001b\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0086\u0001J\u001b\u0010\u0089\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u0086\u0001J\u001c\u0010\u008e\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u008a\u0001\u001a\u000205H\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001f\u0010f\u001a\u00020\u00132\u0006\u0010u\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bf\u0010HJ \u0010]\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0005\b]\u0010\u008f\u0001J\u001a\u0010\u0090\u0001\u001a\u00020\u00112\u0006\u0010|\u001a\u00020+H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J#\u0010\u0090\u0001\u001a\u00020\u00112\u0006\u0010|\u001a\u00020+2\u0007\u0010\u0092\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0093\u0001J,\u0010\u0090\u0001\u001a\u00020\u00112\u0006\u0010|\u001a\u00020+2\u0007\u0010\u0092\u0001\u001a\u00020\u00112\u0007\u0010\u0094\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0095\u0001J\u001b\u0010\u0090\u0001\u001a\u00020\u00112\u0007\u0010\u0096\u0001\u001a\u00020>H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0097\u0001J$\u0010\u0090\u0001\u001a\u00020\u00112\u0007\u0010\u0096\u0001\u001a\u00020>2\u0007\u0010\u0092\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0098\u0001J\u001b\u0010\u009a\u0001\u001a\u00020\u00112\u0007\u0010\u0099\u0001\u001a\u00020>H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u0097\u0001J$\u0010\u009a\u0001\u001a\u00020\u00112\u0007\u0010\u0099\u0001\u001a\u00020>2\u0007\u0010\u0092\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u0098\u0001J#\u0010\u009b\u0001\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0007\u0010\u0096\u0001\u001a\u00020>H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J4\u0010\u009b\u0001\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0007\u0010\u0096\u0001\u001a\u00020>2\u0007\u0010\u009d\u0001\u001a\u0002052\u0006\u0010\u0012\u001a\u000205H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009e\u0001J\u0011\u0010\u009f\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u009f\u0001\u0010\u0006J\u0011\u0010 \u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b \u0001\u0010\u0010J\u0011\u0010¡\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b¡\u0001\u0010\u0006J\u0013\u0010£\u0001\u001a\u00030¢\u0001H\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u000f\u0010¥\u0001\u001a\u00020>¢\u0006\u0005\b¥\u0001\u0010@J\u000f\u0010¦\u0001\u001a\u00020>¢\u0006\u0005\b¦\u0001\u0010@J\u000f\u0010§\u0001\u001a\u00020>¢\u0006\u0005\b§\u0001\u0010@J\u000f\u0010¨\u0001\u001a\u00020>¢\u0006\u0005\b¨\u0001\u0010@J\u0019\u0010ª\u0001\u001a\u00020>2\u0007\u0010©\u0001\u001a\u00020>¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0019\u0010¬\u0001\u001a\u00020>2\u0007\u0010©\u0001\u001a\u00020>¢\u0006\u0006\b¬\u0001\u0010«\u0001J\u0019\u0010\u00ad\u0001\u001a\u00020>2\u0007\u0010©\u0001\u001a\u00020>¢\u0006\u0006\b\u00ad\u0001\u0010«\u0001J\u001f\u0010°\u0001\u001a\u00020\u000e2\n\u0010¯\u0001\u001a\u0005\u0018\u00010®\u0001H\u0096\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0011\u0010²\u0001\u001a\u000205H\u0016¢\u0006\u0005\b²\u0001\u00107J\u0011\u0010³\u0001\u001a\u00020LH\u0016¢\u0006\u0005\b³\u0001\u0010NJ\u000f\u0010´\u0001\u001a\u00020\u0000¢\u0006\u0005\b´\u0001\u0010\bJ\u0011\u0010µ\u0001\u001a\u00020\u0000H\u0016¢\u0006\u0005\bµ\u0001\u0010\bJ\u000f\u0010¶\u0001\u001a\u00020>¢\u0006\u0005\b¶\u0001\u0010@J\u0018\u0010¶\u0001\u001a\u00020>2\u0006\u0010\u0012\u001a\u000205¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u001f\u0010º\u0001\u001a\u00030¸\u00012\n\b\u0002\u0010¹\u0001\u001a\u00030¸\u0001H\u0007¢\u0006\u0006\bº\u0001\u0010»\u0001J\u001f\u0010¼\u0001\u001a\u00030¸\u00012\n\b\u0002\u0010¹\u0001\u001a\u00030¸\u0001H\u0007¢\u0006\u0006\b¼\u0001\u0010»\u0001J\u0019\u0010/\u001a\u00020+2\u0007\u0010½\u0001\u001a\u00020\u0011H\u0007¢\u0006\u0005\b¾\u0001\u00100J\u0011\u0010À\u0001\u001a\u00020\u0011H\u0007¢\u0006\u0005\b¿\u0001\u0010*J)\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010Á\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b&\u0010Â\u0001J\u001b\u0010Ä\u0001\u001a\u00020>2\u0007\u0010Ã\u0001\u001a\u00020LH\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J$\u0010Æ\u0001\u001a\u00020>2\u0007\u0010Ã\u0001\u001a\u00020L2\u0007\u0010©\u0001\u001a\u00020>H\u0002¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001R\u001c\u0010È\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R0\u0010À\u0001\u001a\u00020\u00112\u0007\u0010Ê\u0001\u001a\u00020\u00118G@@X\u0086\u000e¢\u0006\u0016\n\u0006\bÀ\u0001\u0010Ë\u0001\u001a\u0005\bÀ\u0001\u0010*\"\u0005\bÌ\u0001\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001¨\u0006Ð\u0001"}, d2 = {"Lcom/applovin/shadow/okio/Buffer;", "Lcom/applovin/shadow/okio/BufferedSource;", "Lcom/applovin/shadow/okio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "buffer", "()Lcom/applovin/shadow/okio/Buffer;", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "emitCompleteSegments", "emit", "", "exhausted", "()Z", "", "byteCount", "Lwj/r;", "require", "(J)V", "request", "(J)Z", "peek", "()Lcom/applovin/shadow/okio/BufferedSource;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "out", "offset", "copyTo", "(Ljava/io/OutputStream;JJ)Lcom/applovin/shadow/okio/Buffer;", "(Lcom/applovin/shadow/okio/Buffer;JJ)Lcom/applovin/shadow/okio/Buffer;", "(Lcom/applovin/shadow/okio/Buffer;J)Lcom/applovin/shadow/okio/Buffer;", "writeTo", "(Ljava/io/OutputStream;J)Lcom/applovin/shadow/okio/Buffer;", "input", "readFrom", "(Ljava/io/InputStream;)Lcom/applovin/shadow/okio/Buffer;", "(Ljava/io/InputStream;J)Lcom/applovin/shadow/okio/Buffer;", "completeSegmentByteCount", "()J", "", "readByte", "()B", "pos", "getByte", "(J)B", "get", "", "readShort", "()S", "", "readInt", "()I", "readLong", "readShortLe", "readIntLe", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "Lcom/applovin/shadow/okio/ByteString;", "readByteString", "()Lcom/applovin/shadow/okio/ByteString;", "(J)Lcom/applovin/shadow/okio/ByteString;", "Lcom/applovin/shadow/okio/Options;", "options", "select", "(Lcom/applovin/shadow/okio/Options;)I", "sink", "readFully", "(Lcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okio/Sink;", "readAll", "(Lcom/applovin/shadow/okio/Sink;)J", "", "readUtf8", "()Ljava/lang/String;", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", B5.N, "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "readUtf8Line", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "", "readByteArray", "()[B", "(J)[B", "read", "([B)I", "([B)V", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "clear", "skip", "byteString", "write", "(Lcom/applovin/shadow/okio/ByteString;)Lcom/applovin/shadow/okio/Buffer;", "(Lcom/applovin/shadow/okio/ByteString;II)Lcom/applovin/shadow/okio/Buffer;", "string", "writeUtf8", "(Ljava/lang/String;)Lcom/applovin/shadow/okio/Buffer;", "beginIndex", "endIndex", "(Ljava/lang/String;II)Lcom/applovin/shadow/okio/Buffer;", "codePoint", "writeUtf8CodePoint", "(I)Lcom/applovin/shadow/okio/Buffer;", "writeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lcom/applovin/shadow/okio/Buffer;", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lcom/applovin/shadow/okio/Buffer;", "source", "([B)Lcom/applovin/shadow/okio/Buffer;", "([BII)Lcom/applovin/shadow/okio/Buffer;", "Lcom/applovin/shadow/okio/Source;", "writeAll", "(Lcom/applovin/shadow/okio/Source;)J", "(Lcom/applovin/shadow/okio/Source;J)Lcom/applovin/shadow/okio/Buffer;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "writeByte", "s", "writeShort", "writeShortLe", "i", "writeInt", "writeIntLe", "v", "writeLong", "(J)Lcom/applovin/shadow/okio/Buffer;", "writeLongLe", "writeDecimalLong", "writeHexadecimalUnsignedLong", "minimumCapacity", "Lcom/applovin/shadow/okio/Segment;", "writableSegment$okio", "(I)Lcom/applovin/shadow/okio/Segment;", "writableSegment", "(Lcom/applovin/shadow/okio/Buffer;J)J", "indexOf", "(B)J", "fromIndex", "(BJ)J", "toIndex", "(BJJ)J", "bytes", "(Lcom/applovin/shadow/okio/ByteString;)J", "(Lcom/applovin/shadow/okio/ByteString;J)J", "targetBytes", "indexOfElement", "rangeEquals", "(JLcom/applovin/shadow/okio/ByteString;)Z", "bytesOffset", "(JLcom/applovin/shadow/okio/ByteString;II)Z", "flush", "isOpen", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "Lcom/applovin/shadow/okio/Timeout;", "timeout", "()Lcom/applovin/shadow/okio/Timeout;", "md5", "sha1", "sha256", "sha512", X3.i.W, "hmacSha1", "(Lcom/applovin/shadow/okio/ByteString;)Lcom/applovin/shadow/okio/ByteString;", "hmacSha256", "hmacSha512", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "copy", "clone", "snapshot", "(I)Lcom/applovin/shadow/okio/ByteString;", "Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "unsafeCursor", "readUnsafe", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;)Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "readAndWriteUnsafe", "index", "-deprecated_getByte", "-deprecated_size", "size", "forever", "(Ljava/io/InputStream;JZ)V", "algorithm", "digest", "(Ljava/lang/String;)Lcom/applovin/shadow/okio/ByteString;", "hmac", "(Ljava/lang/String;Lcom/applovin/shadow/okio/ByteString;)Lcom/applovin/shadow/okio/ByteString;", TtmlNode.TAG_HEAD, "Lcom/applovin/shadow/okio/Segment;", "<set-?>", "J", "setSize$okio", "getBuffer", "()Llo/e;", "UnsafeCursor", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    public Segment head;
    private long size;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010%¨\u0006'"}, d2 = {"Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "<init>", "()V", "", "next", "()I", "", "offset", "seek", "(J)I", "newSize", "resizeBuffer", "(J)J", "minByteCount", "expandBuffer", "(I)J", "Lwj/r;", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "Lcom/applovin/shadow/okio/Buffer;", "buffer", "Lcom/applovin/shadow/okio/Buffer;", "", "readWrite", "Z", "Lcom/applovin/shadow/okio/Segment;", D1.f25924i, "Lcom/applovin/shadow/okio/Segment;", "getSegment$okio", "()Llo/o;", "setSegment$okio", "(Llo/o;)V", "J", "", "data", "[B", "start", "I", TtmlNode.END, "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class UnsafeCursor implements Closeable {
        public Buffer buffer;
        public byte[] data;
        public boolean readWrite;
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int minByteCount) {
            if (minByteCount <= 0) {
                throw new IllegalArgumentException(d.e(minByteCount, "minByteCount <= 0: ").toString());
            }
            if (minByteCount > 8192) {
                throw new IllegalArgumentException(d.e(minByteCount, "minByteCount > Segment.SIZE: ").toString());
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long size = buffer.size();
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(minByteCount);
            int i10 = 8192 - segmentWritableSegment$okio.limit;
            segmentWritableSegment$okio.limit = Segment.SIZE;
            long j10 = i10;
            buffer.setSize$okio(size + j10);
            setSegment$okio(segmentWritableSegment$okio);
            this.offset = size;
            this.data = segmentWritableSegment$okio.data;
            this.start = 8192 - i10;
            this.end = Segment.SIZE;
            return j10;
        }

        /* JADX INFO: renamed from: getSegment$okio, reason: from getter */
        public final Segment getSegment() {
            return this.segment;
        }

        public final int next() {
            long j10 = this.offset;
            Buffer buffer = this.buffer;
            n.c(buffer);
            if (j10 == buffer.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.offset;
            return seek(j11 == -1 ? 0L : j11 + ((long) (this.end - this.start)));
        }

        public final long resizeBuffer(long newSize) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = buffer.size();
            if (newSize <= size) {
                if (newSize < 0) {
                    throw new IllegalArgumentException(e.i(newSize, "newSize < 0: ").toString());
                }
                long j10 = size - newSize;
                while (j10 > 0) {
                    Segment segment = buffer.head;
                    n.c(segment);
                    Segment segment2 = segment.prev;
                    n.c(segment2);
                    int i10 = segment2.limit;
                    long j11 = i10 - segment2.pos;
                    if (j11 > j10) {
                        segment2.limit = i10 - ((int) j10);
                        break;
                    }
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j10 -= j11;
                }
                setSegment$okio(null);
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j12 = newSize - size;
                boolean z10 = true;
                while (j12 > 0) {
                    Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                    int iMin = (int) Math.min(j12, 8192 - segmentWritableSegment$okio.limit);
                    segmentWritableSegment$okio.limit += iMin;
                    j12 -= (long) iMin;
                    if (z10) {
                        setSegment$okio(segmentWritableSegment$okio);
                        this.offset = size;
                        this.data = segmentWritableSegment$okio.data;
                        int i11 = segmentWritableSegment$okio.limit;
                        this.start = i11 - iMin;
                        this.end = i11;
                        z10 = false;
                    }
                }
            }
            buffer.setSize$okio(newSize);
            return size;
        }

        public final int seek(long offset) {
            Segment segmentPush;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (offset < -1 || offset > buffer.size()) {
                StringBuilder sbL = wi.d.l(offset, "offset=", " > size=");
                sbL.append(buffer.size());
                throw new ArrayIndexOutOfBoundsException(sbL.toString());
            }
            if (offset == -1 || offset == buffer.size()) {
                setSegment$okio(null);
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = buffer.size();
            Segment segment = buffer.head;
            long j10 = 0;
            if (getSegment() != null) {
                long j11 = this.offset;
                int i10 = this.start;
                Segment segment2 = getSegment();
                n.c(segment2);
                long j12 = j11 - ((long) (i10 - segment2.pos));
                if (j12 > offset) {
                    segmentPush = segment;
                    segment = getSegment();
                    size = j12;
                } else {
                    segmentPush = getSegment();
                    j10 = j12;
                }
            } else {
                segmentPush = segment;
            }
            if (size - offset > offset - j10) {
                while (true) {
                    n.c(segmentPush);
                    int i11 = segmentPush.limit;
                    int i12 = segmentPush.pos;
                    if (offset < ((long) (i11 - i12)) + j10) {
                        break;
                    }
                    j10 += (long) (i11 - i12);
                    segmentPush = segmentPush.next;
                }
            } else {
                while (size > offset) {
                    n.c(segment);
                    segment = segment.prev;
                    n.c(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                j10 = size;
                segmentPush = segment;
            }
            if (this.readWrite) {
                n.c(segmentPush);
                if (segmentPush.shared) {
                    Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                    if (buffer.head == segmentPush) {
                        buffer.head = segmentUnsharedCopy;
                    }
                    segmentPush = segmentPush.push(segmentUnsharedCopy);
                    Segment segment3 = segmentPush.prev;
                    n.c(segment3);
                    segment3.pop();
                }
            }
            setSegment$okio(segmentPush);
            this.offset = offset;
            n.c(segmentPush);
            this.data = segmentPush.data;
            int i13 = segmentPush.pos + ((int) (offset - j10));
            this.start = i13;
            int i14 = segmentPush.limit;
            this.end = i14;
            return i14 - i13;
        }

        public final void setSegment$okio(Segment segment) {
            this.segment = segment;
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j10, long j11, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = buffer.size - j12;
        }
        return buffer.copyTo(outputStream, j12, j11);
    }

    private final ByteString digest(String algorithm) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i10 = segment.pos;
            messageDigest.update(bArr, i10, segment.limit - i10);
            Segment segment2 = segment.next;
            n.c(segment2);
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i11 = segment2.pos;
                messageDigest.update(bArr2, i11, segment2.limit - i11);
                segment2 = segment2.next;
                n.c(segment2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        n.e(bArrDigest, "digest(...)");
        return new ByteString(bArrDigest);
    }

    private final ByteString hmac(String algorithm, ByteString key) throws NoSuchAlgorithmException {
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.internalArray$okio(), algorithm));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i10 = segment.pos;
                mac.update(bArr, i10, segment.limit - i10);
                Segment segment2 = segment.next;
                n.c(segment2);
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i11 = segment2.pos;
                    mac.update(bArr2, i11, segment2.limit - i11);
                    segment2 = segment2.next;
                    n.c(segment2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            n.e(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = buffer.size;
        }
        return buffer.writeTo(outputStream, j10);
    }

    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m137deprecated_getByte(long index) {
        return getByte(index);
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    public final void clear() throws EOFException {
        skip(size());
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        n.c(segment);
        Segment segment2 = segment.prev;
        n.c(segment2);
        int i10 = segment2.limit;
        return (i10 >= 8192 || !segment2.owner) ? size : size - ((long) (i10 - segment2.pos));
    }

    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() == 0) {
            return buffer;
        }
        Segment segment = this.head;
        n.c(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            n.c(segment3);
            n.c(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer.setSize$okio(size());
        return buffer;
    }

    public final Buffer copyTo(OutputStream out) throws IOException {
        n.f(out, "out");
        return copyTo$default(this, out, 0L, 0L, 6, (Object) null);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer emit() {
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) other;
        if (size() != buffer.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        Segment segment = this.head;
        n.c(segment);
        Segment segment2 = buffer.head;
        n.c(segment2);
        int i10 = segment.pos;
        int i11 = segment2.pos;
        long j10 = 0;
        while (j10 < size()) {
            long jMin = Math.min(segment.limit - i10, segment2.limit - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (segment.data[i10] != segment2.data[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == segment.limit) {
                segment = segment.next;
                n.c(segment);
                i10 = segment.pos;
            }
            if (i11 == segment2.limit) {
                segment2 = segment2.next;
                n.c(segment2);
                i11 = segment2.pos;
            }
            j10 += jMin;
        }
        return true;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    public final byte getByte(long pos) {
        SegmentedByteString.checkOffsetAndCount(size(), pos, 1L);
        Segment segment = this.head;
        if (segment == null) {
            n.c(null);
            throw null;
        }
        if (size() - pos < pos) {
            long size = size();
            while (size > pos) {
                segment = segment.prev;
                n.c(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            return segment.data[(int) ((((long) segment.pos) + pos) - size)];
        }
        long j10 = 0;
        while (true) {
            int i10 = segment.limit;
            int i11 = segment.pos;
            long j11 = ((long) (i10 - i11)) + j10;
            if (j11 > pos) {
                return segment.data[(int) ((((long) i11) + pos) - j10)];
            }
            segment = segment.next;
            n.c(segment);
            j10 = j11;
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = segment.limit;
            for (int i12 = segment.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + segment.data[i12];
            }
            segment = segment.next;
            n.c(segment);
        } while (segment != this.head);
        return i10;
    }

    public final ByteString hmacSha1(ByteString key) {
        n.f(key, "key");
        return hmac("HmacSHA1", key);
    }

    public final ByteString hmacSha256(ByteString key) {
        n.f(key, "key");
        return hmac("HmacSHA256", key);
    }

    public final ByteString hmacSha512(ByteString key) {
        n.f(key, "key");
        return hmac("HmacSHA512", key);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(byte b10) {
        return indexOf(b10, 0L, Long.MAX_VALUE);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOfElement(ByteString targetBytes) {
        n.f(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: com.applovin.shadow.okio.Buffer.inputStream.1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & 255;
                }
                return -1;
            }

            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] sink, int offset, int byteCount) {
                n.f(sink, "sink");
                return Buffer.this.read(sink, offset, byteCount);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final ByteString md5() {
        return digest(SameMD5.TAG);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: com.applovin.shadow.okio.Buffer.outputStream.1
            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int b10) {
                Buffer.this.writeByte(b10);
            }

            @Override // java.io.OutputStream
            public void write(byte[] data, int offset, int byteCount) {
                n.f(data, "data");
                Buffer.this.write(data, offset, byteCount);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }
        };
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean rangeEquals(long offset, ByteString bytes) {
        n.f(bytes, "bytes");
        return rangeEquals(offset, bytes, 0, bytes.size());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) throws IOException {
        n.f(sink, "sink");
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), segment.limit - segment.pos);
        sink.put(segment.data, segment.pos, iMin);
        int i10 = segment.pos + iMin;
        segment.pos = i10;
        this.size -= (long) iMin;
        if (i10 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readAll(Sink sink) throws IOException {
        n.f(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        Segment segment = this.head;
        n.c(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        int i12 = i10 + 1;
        byte b10 = segment.data[i10];
        setSize$okio(size() - 1);
        if (i12 != i11) {
            segment.pos = i12;
            return b10;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return b10;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public ByteString readByteString() {
        return readByteString(size());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readDecimalLong() throws EOFException {
        long j10;
        byte b10;
        long j11 = 0;
        if (size() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j12 = 0;
        long j13 = -7;
        boolean z11 = false;
        loop0: while (true) {
            Segment segment = this.head;
            n.c(segment);
            byte[] bArr = segment.data;
            int i11 = segment.pos;
            int i12 = segment.limit;
            while (true) {
                if (i11 >= i12) {
                    j10 = j11;
                    break;
                }
                b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j12 < com.applovin.shadow.okio.internal.Buffer.OVERFLOW_ZONE) {
                        break loop0;
                    }
                    j10 = j11;
                    if (j12 == com.applovin.shadow.okio.internal.Buffer.OVERFLOW_ZONE && i13 < j13) {
                        break loop0;
                    }
                    j12 = (j12 * 10) + ((long) i13);
                } else {
                    j10 = j11;
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j13--;
                    z10 = true;
                }
                i11++;
                i10++;
                j11 = j10;
            }
            if (i11 == i12) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i11;
            }
            if (z11 || this.head == null) {
                setSize$okio(size() - ((long) i10));
                if (i10 >= (z10 ? 2 : 1)) {
                    return z10 ? j12 : -j12;
                }
                if (size() == j10) {
                    throw new EOFException();
                }
                StringBuilder sbJ = u.j(z10 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                sbJ.append(SegmentedByteString.toHexString(getByte(j10)));
                throw new NumberFormatException(sbJ.toString());
            }
            j11 = j10;
        }
        Buffer bufferWriteByte = new Buffer().writeDecimalLong(j12).writeByte((int) b10);
        if (!z10) {
            bufferWriteByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + bufferWriteByte.readUtf8());
    }

    public final Buffer readFrom(InputStream input) throws IOException {
        n.f(input, "input");
        readFrom(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void readFully(Buffer sink, long byteCount) throws EOFException {
        n.f(sink, "sink");
        if (size() >= byteCount) {
            sink.write(this, byteCount);
        } else {
            sink.write(this, size());
            throw new EOFException();
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws EOFException {
        int i10;
        if (size() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            Segment segment = this.head;
            n.c(segment);
            byte[] bArr = segment.data;
            int i12 = segment.pos;
            int i13 = segment.limit;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 != 0) {
                            z10 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + SegmentedByteString.toHexString(b10));
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new Buffer().writeHexadecimalUnsignedLong(j10).writeByte((int) b10).readUtf8());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i12;
            }
            if (z10) {
                break;
            }
        } while (this.head != null);
        setSize$okio(size() - ((long) i11));
        return j10;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        Segment segment = this.head;
        n.c(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        setSize$okio(size() - 4);
        if (i14 != i11) {
            segment.pos = i14;
            return i15;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return i15;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int readIntLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readInt());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        Segment segment = this.head;
        n.c(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        setSize$okio(size() - 8);
        if (i13 != i11) {
            segment.pos = i13;
            return j11;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return j11;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readLongLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readLong());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        Segment segment = this.head;
        n.c(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        setSize$okio(size() - 2);
        if (i14 == i11) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i14;
        }
        return (short) i15;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public short readShortLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readShort());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readString(Charset charset) {
        n.f(charset, "charset");
        return readString(this.size, charset);
    }

    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8() {
        return readString(this.size, a.f3768a);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (size() == 0) {
            throw new EOFException();
        }
        byte b10 = getByte(0L);
        if ((b10 & 128) == 0) {
            i10 = b10 & 127;
            i12 = 0;
            i11 = 1;
        } else if ((b10 & 224) == 192) {
            i10 = b10 & 31;
            i11 = 2;
            i12 = 128;
        } else if ((b10 & 240) == 224) {
            i10 = b10 & 15;
            i11 = 3;
            i12 = com.ironsource.mediationsdk.metadata.a.f29616n;
        } else {
            if ((b10 & 248) != 240) {
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = b10 & 7;
            i11 = 4;
            i12 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        long j10 = i11;
        if (size() < j10) {
            StringBuilder sbU = e.u(i11, "size < ", ": ");
            sbU.append(size());
            sbU.append(" (to read code point prefixed 0x");
            sbU.append(SegmentedByteString.toHexString(b10));
            sbU.append(')');
            throw new EOFException(sbU.toString());
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte b11 = getByte(j11);
            if ((b11 & 192) != 128) {
                skip(j11);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = (i10 << 6) | (b11 & Utf8.REPLACEMENT_BYTE);
        }
        skip(j10);
        if (i10 > 1114111) {
            return Utf8.REPLACEMENT_CODE_POINT;
        }
        return ((55296 > i10 || i10 >= 57344) && i10 >= i12) ? i10 : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8Line() throws EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return com.applovin.shadow.okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean request(long byteCount) {
        return this.size >= byteCount;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void require(long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int select(Options options) throws EOFException {
        n.f(options, "options");
        int iSelectPrefix$default = com.applovin.shadow.okio.internal.Buffer.selectPrefix$default(this, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public final void setSize$okio(long j10) {
        this.size = j10;
    }

    public final ByteString sha1() {
        return digest(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public final ByteString sha256() {
        return digest("SHA-256");
    }

    public final ByteString sha512() {
        return digest("SHA-512");
    }

    public final long size() {
        return this.size;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
            long j10 = iMin;
            setSize$okio(size() - j10);
            byteCount -= j10;
            int i10 = segment.pos + iMin;
            segment.pos = i10;
            if (i10 == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public final ByteString snapshot() {
        if (size() <= 2147483647L) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // com.applovin.shadow.okio.Source
    public Timeout timeout() {
        return Timeout.NONE;
    }

    public String toString() {
        return snapshot().toString();
    }

    public final Segment writableSegment$okio(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = this.head;
        if (segment != null) {
            n.c(segment);
            Segment segment2 = segment.prev;
            n.c(segment2);
            return (segment2.limit + minimumCapacity > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        this.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        n.f(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    public final Buffer writeTo(OutputStream out) throws IOException {
        n.f(out, "out");
        return writeTo$default(this, out, 0L, 2, null);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Buffer m139clone() {
        return copy();
    }

    public final Buffer copyTo(OutputStream out, long j10) throws IOException {
        n.f(out, "out");
        return copyTo$default(this, out, j10, 0L, 4, (Object) null);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(byte b10, long fromIndex) {
        return indexOf(b10, fromIndex, Long.MAX_VALUE);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOfElement(ByteString targetBytes, long fromIndex) {
        int i10;
        int i11;
        n.f(targetBytes, "targetBytes");
        long size = 0;
        if (fromIndex < 0) {
            throw new IllegalArgumentException(e.i(fromIndex, "fromIndex < 0: ").toString());
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - fromIndex < fromIndex) {
            size = size();
            while (size > fromIndex) {
                segment = segment.prev;
                n.c(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (targetBytes.size() == 2) {
                byte b10 = targetBytes.getByte(0);
                byte b11 = targetBytes.getByte(1);
                while (size < size()) {
                    byte[] bArr = segment.data;
                    i10 = (int) ((((long) segment.pos) + fromIndex) - size);
                    int i12 = segment.limit;
                    while (true) {
                        if (i10 >= i12) {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            n.c(segment);
                            fromIndex = size;
                        } else {
                            byte b12 = bArr[i10];
                            if (b12 == b10 || b12 == b11) {
                                i11 = segment.pos;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < size()) {
                    byte[] bArr2 = segment.data;
                    i10 = (int) ((((long) segment.pos) + fromIndex) - size);
                    int i13 = segment.limit;
                    while (true) {
                        if (i10 < i13) {
                            byte b13 = bArr2[i10];
                            int length = bArrInternalArray$okio.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    i10++;
                                } else if (b13 == bArrInternalArray$okio[i14]) {
                                    i11 = segment.pos;
                                } else {
                                    i14++;
                                }
                            }
                        } else {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            n.c(segment);
                            fromIndex = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (segment.limit - segment.pos)) + size;
            if (j10 > fromIndex) {
                break;
            }
            segment = segment.next;
            n.c(segment);
            size = j10;
        }
        if (targetBytes.size() == 2) {
            byte b14 = targetBytes.getByte(0);
            byte b15 = targetBytes.getByte(1);
            while (size < size()) {
                byte[] bArr3 = segment.data;
                i10 = (int) ((((long) segment.pos) + fromIndex) - size);
                int i15 = segment.limit;
                while (true) {
                    if (i10 >= i15) {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        n.c(segment);
                        fromIndex = size;
                    } else {
                        byte b16 = bArr3[i10];
                        if (b16 == b14 || b16 == b15) {
                            i11 = segment.pos;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < size()) {
                byte[] bArr4 = segment.data;
                i10 = (int) ((((long) segment.pos) + fromIndex) - size);
                int i16 = segment.limit;
                while (true) {
                    if (i10 < i16) {
                        byte b17 = bArr4[i10];
                        int length2 = bArrInternalArray$okio2.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                i10++;
                            } else if (b17 == bArrInternalArray$okio2[i17]) {
                                i11 = segment.pos;
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        n.c(segment);
                        fromIndex = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean rangeEquals(long offset, ByteString bytes, int bytesOffset, int byteCount) {
        n.f(bytes, "bytes");
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || size() - offset < byteCount || bytes.size() - bytesOffset < byteCount) {
            return false;
        }
        for (int i10 = 0; i10 < byteCount; i10++) {
            if (getByte(((long) i10) + offset) != bytes.getByte(bytesOffset + i10)) {
                return false;
            }
        }
        return true;
    }

    public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        n.f(unsafeCursor, "unsafeCursor");
        return com.applovin.shadow.okio.internal.Buffer.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public byte[] readByteArray(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(e.i(byteCount, "byteCount: ").toString());
        }
        if (size() < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public ByteString readByteString(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(e.i(byteCount, "byteCount: ").toString());
        }
        if (size() < byteCount) {
            throw new EOFException();
        }
        if (byteCount < 4096) {
            return new ByteString(readByteArray(byteCount));
        }
        ByteString byteStringSnapshot = snapshot((int) byteCount);
        skip(byteCount);
        return byteStringSnapshot;
    }

    public final Buffer readFrom(InputStream input, long byteCount) throws IOException {
        n.f(input, "input");
        if (byteCount < 0) {
            throw new IllegalArgumentException(e.i(byteCount, "byteCount < 0: ").toString());
        }
        readFrom(input, byteCount, false);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readString(long byteCount, Charset charset) throws EOFException {
        n.f(charset, "charset");
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(e.i(byteCount, "byteCount: ").toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        Segment segment = this.head;
        n.c(segment);
        int i10 = segment.pos;
        if (((long) i10) + byteCount > segment.limit) {
            return new String(readByteArray(byteCount), charset);
        }
        int i11 = (int) byteCount;
        String str = new String(segment.data, i10, i11, charset);
        int i12 = segment.pos + i11;
        segment.pos = i12;
        this.size -= byteCount;
        if (i12 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
        n.f(unsafeCursor, "unsafeCursor");
        return com.applovin.shadow.okio.internal.Buffer.commonReadUnsafe(this, unsafeCursor);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8(long byteCount) throws EOFException {
        return readString(byteCount, a.f3768a);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8LineStrict(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(e.i(limit, "limit < 0: ").toString());
        }
        long j10 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j10);
        if (jIndexOf != -1) {
            return com.applovin.shadow.okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (j10 < size() && getByte(j10 - 1) == 13 && getByte(j10) == 10) {
            return com.applovin.shadow.okio.internal.Buffer.readUtf8Line(this, j10);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), limit) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeByte(int b10) {
        Segment segmentWritableSegment$okio = writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i10 + 1;
        bArr[i10] = (byte) b10;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeDecimalLong(long v4) {
        boolean z10;
        if (v4 == 0) {
            return writeByte(48);
        }
        int i10 = 1;
        if (v4 < 0) {
            v4 = -v4;
            if (v4 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (v4 < 100000000) {
            if (v4 < Xa.f27908s) {
                if (v4 >= 100) {
                    i10 = v4 < 1000 ? 3 : 4;
                } else if (v4 >= 10) {
                    i10 = 2;
                }
            } else if (v4 < 1000000) {
                i10 = v4 < 100000 ? 5 : 6;
            } else {
                i10 = v4 < 10000000 ? 7 : 8;
            }
        } else if (v4 < 1000000000000L) {
            if (v4 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i10 = v4 < C.NANOS_PER_SECOND ? 9 : 10;
            } else {
                i10 = v4 < 100000000000L ? 11 : 12;
            }
        } else if (v4 < 1000000000000000L) {
            if (v4 < 10000000000000L) {
                i10 = 13;
            } else {
                i10 = v4 < 100000000000000L ? 14 : 15;
            }
        } else if (v4 < 100000000000000000L) {
            i10 = v4 < 10000000000000000L ? 16 : 17;
        } else {
            i10 = v4 < 1000000000000000000L ? 18 : 19;
        }
        if (z10) {
            i10++;
        }
        Segment segmentWritableSegment$okio = writableSegment$okio(i10);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit + i10;
        while (v4 != 0) {
            long j10 = 10;
            i11--;
            bArr[i11] = com.applovin.shadow.okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (v4 % j10)];
            v4 /= j10;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i10;
        setSize$okio(size() + ((long) i10));
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeHexadecimalUnsignedLong(long v4) {
        if (v4 == 0) {
            return writeByte(48);
        }
        long j10 = (v4 >>> 1) | v4;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment segmentWritableSegment$okio = writableSegment$okio(i10);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = com.applovin.shadow.okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (15 & v4)];
            v4 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i10;
        setSize$okio(size() + ((long) i10));
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeInt(int i10) {
        Segment segmentWritableSegment$okio = writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        segmentWritableSegment$okio.limit = i11 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeIntLe(int i10) {
        return writeInt(SegmentedByteString.reverseBytes(i10));
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeLong(long v4) {
        Segment segmentWritableSegment$okio = writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((v4 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((v4 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((v4 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((v4 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((v4 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((v4 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((v4 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (v4 & 255);
        segmentWritableSegment$okio.limit = i10 + 8;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeLongLe(long v4) {
        return writeLong(SegmentedByteString.reverseBytes(v4));
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeShort(int s10) {
        Segment segmentWritableSegment$okio = writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((s10 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (s10 & 255);
        segmentWritableSegment$okio.limit = i10 + 2;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeShortLe(int s10) {
        return writeShort((int) SegmentedByteString.reverseBytes((short) s10));
    }

    public final Buffer writeTo(OutputStream out, long byteCount) throws IOException {
        n.f(out, "out");
        SegmentedByteString.checkOffsetAndCount(this.size, 0L, byteCount);
        Segment segment = this.head;
        long j10 = byteCount;
        while (j10 > 0) {
            n.c(segment);
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            out.write(segment.data, segment.pos, iMin);
            int i10 = segment.pos + iMin;
            segment.pos = i10;
            long j11 = iMin;
            this.size -= j11;
            j10 -= j11;
            if (i10 == segment.limit) {
                Segment segmentPop = segment.pop();
                this.head = segmentPop;
                SegmentPool.recycle(segment);
                segment = segmentPop;
            }
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeUtf8CodePoint(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
            return this;
        }
        if (codePoint < 2048) {
            Segment segmentWritableSegment$okio = writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i10 = segmentWritableSegment$okio.limit;
            bArr[i10] = (byte) ((codePoint >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i10 + 1] = (byte) ((codePoint & 63) | 128);
            segmentWritableSegment$okio.limit = i10 + 2;
            setSize$okio(size() + 2);
            return this;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            writeByte(63);
            return this;
        }
        if (codePoint < 65536) {
            Segment segmentWritableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i11 = segmentWritableSegment$okio2.limit;
            bArr2[i11] = (byte) ((codePoint >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((codePoint & 63) | 128);
            segmentWritableSegment$okio2.limit = i11 + 3;
            setSize$okio(size() + 3);
            return this;
        }
        if (codePoint > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(codePoint));
        }
        Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i12 = segmentWritableSegment$okio3.limit;
        bArr3[i12] = (byte) ((codePoint >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        bArr3[i12 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((codePoint & 63) | 128);
        segmentWritableSegment$okio3.limit = i12 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return buffer.copyTo(buffer2, j10, j11);
    }

    public final Buffer copyTo(OutputStream out, long offset, long byteCount) throws IOException {
        n.f(out, "out");
        long j10 = offset;
        SegmentedByteString.checkOffsetAndCount(this.size, j10, byteCount);
        if (byteCount != 0) {
            Segment segment = this.head;
            while (true) {
                n.c(segment);
                int i10 = segment.limit;
                int i11 = segment.pos;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j11 = byteCount;
            while (j11 > 0) {
                n.c(segment2);
                int i12 = (int) (((long) segment2.pos) + j10);
                int iMin = (int) Math.min(segment2.limit - i12, j11);
                out.write(segment2.data, i12, iMin);
                j11 -= (long) iMin;
                segment2 = segment2.next;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(ByteString bytes) throws IOException {
        n.f(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeString(String string, Charset charset) {
        n.f(string, "string");
        n.f(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeUtf8(String string) {
        n.f(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return buffer.copyTo(buffer2, j10);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(byte b10, long fromIndex, long toIndex) {
        Segment segment;
        int i10;
        long size = 0;
        if (0 > fromIndex || fromIndex > toIndex) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(size());
            sb2.append(" fromIndex=");
            sb2.append(fromIndex);
            throw new IllegalArgumentException(e.s(sb2, " toIndex=", toIndex).toString());
        }
        if (toIndex > size()) {
            toIndex = size();
        }
        if (fromIndex == toIndex || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - fromIndex < fromIndex) {
            size = size();
            while (size > fromIndex) {
                segment = segment.prev;
                n.c(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            while (size < toIndex) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + toIndex) - size);
                i10 = (int) ((((long) segment.pos) + fromIndex) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                n.c(segment);
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (segment.limit - segment.pos)) + size;
            if (j10 > fromIndex) {
                break;
            }
            segment = segment.next;
            n.c(segment);
            size = j10;
        }
        while (size < toIndex) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + toIndex) - size);
            i10 = (int) ((((long) segment.pos) + fromIndex) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            n.c(segment);
            fromIndex = size;
        }
        return -1L;
        return ((long) (i10 - segment.pos)) + size;
    }

    public final ByteString snapshot(int byteCount) {
        if (byteCount == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(size(), 0L, byteCount);
        Segment segment = this.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < byteCount) {
            n.c(segment);
            int i13 = segment.limit;
            int i14 = segment.pos;
            if (i13 != i14) {
                i11 += i13 - i14;
                i12++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        Segment segment2 = this.head;
        int i15 = 0;
        while (i10 < byteCount) {
            n.c(segment2);
            bArr[i15] = segment2.data;
            i10 += segment2.limit - segment2.pos;
            iArr[i15] = Math.min(i10, byteCount);
            iArr[i15 + i12] = segment2.pos;
            segment2.shared = true;
            i15++;
            segment2 = segment2.next;
        }
        return new C0231SegmentedByteString(bArr, iArr);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeUtf8(String string, int beginIndex, int endIndex) {
        char cCharAt;
        n.f(string, "string");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(d.e(beginIndex, "beginIndex < 0: ").toString());
        }
        if (endIndex >= beginIndex) {
            if (endIndex > string.length()) {
                StringBuilder sbU = e.u(endIndex, "endIndex > string.length: ", " > ");
                sbU.append(string.length());
                throw new IllegalArgumentException(sbU.toString().toString());
            }
            while (beginIndex < endIndex) {
                char cCharAt2 = string.charAt(beginIndex);
                if (cCharAt2 < 128) {
                    Segment segmentWritableSegment$okio = writableSegment$okio(1);
                    byte[] bArr = segmentWritableSegment$okio.data;
                    int i10 = segmentWritableSegment$okio.limit - beginIndex;
                    int iMin = Math.min(endIndex, 8192 - i10);
                    int i11 = beginIndex + 1;
                    bArr[beginIndex + i10] = (byte) cCharAt2;
                    while (true) {
                        beginIndex = i11;
                        if (beginIndex >= iMin || (cCharAt = string.charAt(beginIndex)) >= 128) {
                            break;
                        }
                        i11 = beginIndex + 1;
                        bArr[beginIndex + i10] = (byte) cCharAt;
                    }
                    int i12 = segmentWritableSegment$okio.limit;
                    int i13 = (i10 + beginIndex) - i12;
                    segmentWritableSegment$okio.limit = i12 + i13;
                    setSize$okio(size() + ((long) i13));
                } else {
                    if (cCharAt2 < 2048) {
                        Segment segmentWritableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = segmentWritableSegment$okio2.data;
                        int i14 = segmentWritableSegment$okio2.limit;
                        bArr2[i14] = (byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        bArr2[i14 + 1] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio2.limit = i14 + 2;
                        setSize$okio(size() + 2);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i15 = beginIndex + 1;
                        char cCharAt3 = i15 < endIndex ? string.charAt(i15) : (char) 0;
                        if (cCharAt2 <= 56319 && 56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i16 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
                            byte[] bArr3 = segmentWritableSegment$okio3.data;
                            int i17 = segmentWritableSegment$okio3.limit;
                            bArr3[i17] = (byte) ((i16 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            bArr3[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                            bArr3[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                            bArr3[i17 + 3] = (byte) ((i16 & 63) | 128);
                            segmentWritableSegment$okio3.limit = i17 + 4;
                            setSize$okio(size() + 4);
                            beginIndex += 2;
                        } else {
                            writeByte(63);
                            beginIndex = i15;
                        }
                    } else {
                        Segment segmentWritableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i18 = segmentWritableSegment$okio4.limit;
                        bArr4[i18] = (byte) ((cCharAt2 >> '\f') | 224);
                        bArr4[i18 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                        bArr4[i18 + 2] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio4.limit = i18 + 3;
                        setSize$okio(size() + 3);
                    }
                    beginIndex++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(e.g(endIndex, beginIndex, "endIndex < beginIndex: ", " < ").toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void readFully(byte[] sink) throws EOFException {
        n.f(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeString(String string, int beginIndex, int endIndex, Charset charset) {
        n.f(string, "string");
        n.f(charset, "charset");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(d.e(beginIndex, "beginIndex < 0: ").toString());
        }
        if (endIndex >= beginIndex) {
            if (endIndex <= string.length()) {
                if (charset.equals(a.f3768a)) {
                    return writeUtf8(string, beginIndex, endIndex);
                }
                String strSubstring = string.substring(beginIndex, endIndex);
                n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                byte[] bytes = strSubstring.getBytes(charset);
                n.e(bytes, "this as java.lang.String).getBytes(charset)");
                return write(bytes, 0, bytes.length);
            }
            StringBuilder sbU = e.u(endIndex, "endIndex > string.length: ", " > ");
            sbU.append(string.length());
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        throw new IllegalArgumentException(e.g(endIndex, beginIndex, "endIndex < beginIndex: ", " < ").toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) throws IOException {
        n.f(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i10, 8192 - segmentWritableSegment$okio.limit);
            source.get(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            i10 -= iMin;
            segmentWritableSegment$okio.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int read(byte[] sink) {
        n.f(sink, "sink");
        return read(sink, 0, sink.length);
    }

    private final void readFrom(InputStream input, long byteCount, boolean forever) throws IOException {
        while (true) {
            if (byteCount <= 0 && !forever) {
                return;
            }
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int i10 = input.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(byteCount, 8192 - segmentWritableSegment$okio.limit));
            if (i10 == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    this.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (!forever) {
                    throw new EOFException();
                }
                return;
            }
            segmentWritableSegment$okio.limit += i10;
            long j10 = i10;
            this.size += j10;
            byteCount -= j10;
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int read(byte[] sink, int offset, int byteCount) {
        n.f(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, offset, byteCount);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(byteCount, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i10 = segment.pos;
        k.g0(bArr, offset, i10, sink, i10 + iMin);
        segment.pos += iMin;
        setSize$okio(size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public final Buffer copyTo(Buffer out, long offset) {
        n.f(out, "out");
        return copyTo(out, offset, this.size - offset);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer write(ByteString byteString) {
        n.f(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    public final Buffer copyTo(Buffer out, long offset, long byteCount) {
        n.f(out, "out");
        long j10 = offset;
        SegmentedByteString.checkOffsetAndCount(size(), j10, byteCount);
        if (byteCount != 0) {
            out.setSize$okio(out.size() + byteCount);
            Segment segment = this.head;
            while (true) {
                n.c(segment);
                int i10 = segment.limit;
                int i11 = segment.pos;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j11 = byteCount;
            while (j11 > 0) {
                n.c(segment2);
                Segment segmentSharedCopy = segment2.sharedCopy();
                int i12 = segmentSharedCopy.pos + ((int) j10);
                segmentSharedCopy.pos = i12;
                segmentSharedCopy.limit = Math.min(i12 + ((int) j11), segmentSharedCopy.limit);
                Segment segment3 = out.head;
                if (segment3 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    out.head = segmentSharedCopy;
                } else {
                    n.c(segment3);
                    Segment segment4 = segment3.prev;
                    n.c(segment4);
                    segment4.push(segmentSharedCopy);
                }
                j11 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
                segment2 = segment2.next;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer write(ByteString byteString, int offset, int byteCount) {
        n.f(byteString, "byteString");
        byteString.write$okio(this, offset, byteCount);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer write(byte[] source) {
        n.f(source, "source");
        return write(source, 0, source.length);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer write(byte[] source, int offset, int byteCount) {
        n.f(source, "source");
        long j10 = byteCount;
        SegmentedByteString.checkOffsetAndCount(source.length, offset, j10);
        int i10 = byteCount + offset;
        while (offset < i10) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i10 - offset, 8192 - segmentWritableSegment$okio.limit);
            int i11 = offset + iMin;
            k.g0(source, segmentWritableSegment$okio.limit, offset, segmentWritableSegment$okio.data, i11);
            segmentWritableSegment$okio.limit += iMin;
            offset = i11;
        }
        setSize$okio(size() + j10);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSource, com.applovin.shadow.okio.BufferedSink
    /* JADX INFO: renamed from: buffer */
    public Buffer getBufferField() {
        return this;
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.applovin.shadow.okio.BufferedSink, com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // com.applovin.shadow.okio.BufferedSource, com.applovin.shadow.okio.BufferedSink
    public Buffer getBuffer() {
        return this;
    }

    @Override // com.applovin.shadow.okio.Source
    public long read(Buffer sink, long byteCount) {
        n.f(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(e.i(byteCount, "byteCount < 0: ").toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (byteCount > size()) {
            byteCount = size();
        }
        sink.write(this, byteCount);
        return byteCount;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer write(Source source, long byteCount) throws IOException {
        n.f(source, "source");
        while (byteCount > 0) {
            long j10 = source.read(this, byteCount);
            if (j10 == -1) {
                throw new EOFException();
            }
            byteCount -= j10;
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer source, long byteCount) {
        Segment segment;
        n.f(source, "source");
        if (source != this) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
            while (byteCount > 0) {
                Segment segment2 = source.head;
                n.c(segment2);
                int i10 = segment2.limit;
                Segment segment3 = source.head;
                n.c(segment3);
                if (byteCount < i10 - segment3.pos) {
                    Segment segment4 = this.head;
                    if (segment4 != null) {
                        n.c(segment4);
                        segment = segment4.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((((long) segment.limit) + byteCount) - ((long) (segment.shared ? 0 : segment.pos)) <= 8192) {
                            Segment segment5 = source.head;
                            n.c(segment5);
                            segment5.writeTo(segment, (int) byteCount);
                            source.setSize$okio(source.size() - byteCount);
                            setSize$okio(size() + byteCount);
                            return;
                        }
                    }
                    Segment segment6 = source.head;
                    n.c(segment6);
                    source.head = segment6.split((int) byteCount);
                }
                Segment segment7 = source.head;
                n.c(segment7);
                long j10 = segment7.limit - segment7.pos;
                source.head = segment7.pop();
                Segment segment8 = this.head;
                if (segment8 == null) {
                    this.head = segment7;
                    segment7.prev = segment7;
                    segment7.next = segment7;
                } else {
                    n.c(segment8);
                    Segment segment9 = segment8.prev;
                    n.c(segment9);
                    segment9.push(segment7).compact();
                }
                source.setSize$okio(source.size() - j10);
                setSize$okio(size() + j10);
                byteCount -= j10;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(ByteString bytes, long fromIndex) throws IOException {
        int i10;
        long j10 = fromIndex;
        n.f(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j10 >= 0) {
            Segment segment = this.head;
            if (segment == null) {
                return -1L;
            }
            if (size() - j10 < j10) {
                size = size();
                while (size > j10) {
                    segment = segment.prev;
                    n.c(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b10 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (size() - ((long) size2)) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                    i10 = (int) ((((long) segment.pos) + j10) - size);
                    while (i10 < iMin) {
                        if (bArr[i10] != b10 || !com.applovin.shadow.okio.internal.Buffer.rangeEquals(segment, i10 + 1, bArrInternalArray$okio, 1, size2)) {
                            i10++;
                        }
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    n.c(segment);
                    j10 = size;
                }
                return -1L;
            }
            while (true) {
                long j11 = ((long) (segment.limit - segment.pos)) + size;
                if (j11 > j10) {
                    break;
                }
                segment = segment.next;
                n.c(segment);
                size = j11;
            }
            byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
            byte b11 = bArrInternalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (size() - ((long) size4)) + 1;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                long j12 = size5;
                int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - size);
                i10 = (int) ((((long) segment.pos) + j10) - size);
                while (i10 < iMin2) {
                    if (bArr2[i10] == b11 && com.applovin.shadow.okio.internal.Buffer.rangeEquals(segment, i10 + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i10++;
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                n.c(segment);
                size5 = j12;
                j10 = size;
            }
            return -1L;
            return ((long) (i10 - segment.pos)) + size;
        }
        throw new IllegalArgumentException(e.i(j10, "fromIndex < 0: ").toString());
    }
}
