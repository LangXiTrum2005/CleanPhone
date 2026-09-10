package com.p004ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.IronSourceSegment;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.server.HttpFunctions;
import com.p004ironsource.mediationsdk.server.ServerURL;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.p004ironsource.mediationsdk.utils.IronSourceAES;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\n\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002J&\u0010\n\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¨\u0006\u0016"}, d2 = {"Lcom/ironsource/ot;", "", "Landroid/content/Context;", "context", "Lcom/ironsource/ft;", "tools", "Lcom/ironsource/vs;", "request", "Lcom/ironsource/at;", "b", "a", "", "encryptedResponse", "", "hasCompression", "reason", "Lcom/ironsource/ps;", "Lcom/ironsource/ts;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ot {
    private final at b(Context context, ft tools, vs request) {
        at atVarA = a(context, tools, request);
        if (atVarA.c()) {
            return atVarA;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
        qt qtVarA = tools.a(context, request.d());
        if (qtVarA == null) {
            return atVarA;
        }
        at atVar = new at(new ws(qtVarA));
        IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(request.d(), request.f());
        IronSourceLoggerManager.getLogger().log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError + ": " + atVar.getSdkInitResponse(), 1);
        tools.g();
        return atVar;
    }

    private final ps a(String reason) {
        return reason != null ? new ps(ps.f26517h, reason) : new ps(ps.d, "noServerResponse");
    }

    private final String a(String encryptedResponse, boolean hasCompression) {
        String strDecryptAndDecompress = hasCompression ? IronSourceAES.decryptAndDecompress(mb.b().c(), encryptedResponse) : IronSourceAES.decode(mb.b().c(), encryptedResponse);
        Intrinsics.e(strDecryptAndDecompress, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return strDecryptAndDecompress;
    }

    public final void a(Context context, vs request, ft tools, ts listener) {
        Intrinsics.f(context, "context");
        Intrinsics.f(request, "request");
        Intrinsics.f(tools, "tools");
        Intrinsics.f(listener, "listener");
        String strF = request.f();
        if (strF == null) {
            strF = "";
        }
        tools.a("userId", strF);
        tools.a("appKey", request.d());
        tools.getGlobalDataWriter().i(request.f());
        tools.a();
        at atVarB = b(context, tools, request);
        if (atVarB.getSdkInitResponse() == null) {
            ps psVarA = atVarB.getError();
            if (psVarA == null) {
                psVarA = new ps(510, "unknown error");
            }
            listener.a(psVarA);
            return;
        }
        ns nsVar = new ns(atVarB.getSdkInitResponse());
        if (atVarB.c()) {
            listener.a(nsVar);
        } else {
            listener.a(new ps(ps.f26516e, "serverResponseIsNotValid"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ref.ObjectRef reason, String errorMessage) {
        Intrinsics.f(reason, "$reason");
        Intrinsics.f(errorMessage, "errorMessage");
        reason.X = errorMessage;
    }

    private final at a(Context context, ft tools, vs request) {
        try {
            String strA = tools.a(context);
            if (TextUtils.isEmpty(strA)) {
                strA = tools.b(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = strA;
            IronSourceSegment ironSourceSegmentD = tools.d();
            ArrayList<Pair<String, String>> segmentData = ironSourceSegmentD != null ? ironSourceSegmentD.getSegmentData() : null;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            String strSendPostRequest = HttpFunctions.sendPostRequest(ServerURL.buildInitURL(context, request.d(), request.f(), str, null, true, segmentData, false), yi.a().toString(), new O(objectRef, 2));
            if (strSendPostRequest == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return new at(a((String) objectRef.X));
            }
            if (tools.e()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(strSendPostRequest);
                String encryptedResponse = jSONObject.optString(qt.f26623n);
                if (TextUtils.isEmpty(encryptedResponse)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return new at(new ps(2100, ss.FALSE_AVAILABILITY_REASON_NO_RESPONSE_KEY));
                }
                boolean zOptBoolean = jSONObject.optBoolean("compression", false);
                Intrinsics.e(encryptedResponse, "encryptedResponse");
                strSendPostRequest = a(encryptedResponse, zOptBoolean);
                if (TextUtils.isEmpty(strSendPostRequest)) {
                    ironLog.warning("encoded response invalid - return null");
                    tools.f();
                    return new at(new ps(ps.f, ss.FALSE_AVAILABILITY_REASON_DECRYPTION_FAILED));
                }
            }
            qt qtVar = new qt(context, request.d(), request.f(), strSendPostRequest);
            qtVar.a(qt.a.SERVER);
            if (qtVar.p()) {
                return new at(new ws(qtVar));
            }
            IronLog.INTERNAL.warning("response invalid - return null");
            return new at(new ps(ps.f26516e, "serverResponseIsNotValid"));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.warning("exception = " + e2);
            return new at(e2 instanceof JSONException ? new ps(ps.f26516e, "serverResponseIsNotValid") : new ps(510, "internal error"));
        }
    }
}
