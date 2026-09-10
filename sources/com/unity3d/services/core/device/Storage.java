package com.unity3d.services.core.device;

import an.a;
import com.ironsource.X3;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import fn.a1;
import fn.g;
import fn.n0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ!\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/unity3d/services/core/device/Storage;", "Lcom/unity3d/services/core/misc/JsonStorage;", "", "_targetFileName", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "type", "<init>", "(Ljava/lang/String;Lcom/unity3d/services/core/device/StorageManager$StorageType;)V", "", "readStorage", "()Z", "initStorage", "writeStorage", "clearStorage", "storageFileExists", "Lcom/unity3d/services/core/device/StorageEvent;", "eventType", "", X3.i.X, "Lwj/r;", "sendEvent", "(Lcom/unity3d/services/core/device/StorageEvent;Ljava/lang/Object;)V", "Ljava/lang/String;", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "getType", "()Lcom/unity3d/services/core/device/StorageManager$StorageType;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public class Storage extends JsonStorage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final n0 onStorageEventCallbacks = g.c(v.f53866a);
    private final String _targetFileName;
    private final StorageManager.StorageType type;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\tR,\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/core/device/Storage$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/unity3d/services/core/device/StorageEventInfo;", "Lwj/r;", "callback", "addStorageEventCallback", "(Ljk/b;)V", "removeStorageEventCallback", "Lfn/n0;", "", "onStorageEventCallbacks", "Lfn/n0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void addStorageEventCallback(b callback) {
            a1 a1Var;
            Object value;
            n.f(callback, "callback");
            n0 n0Var = Storage.onStorageEventCallbacks;
            do {
                a1Var = (a1) n0Var;
                value = a1Var.getValue();
            } while (!a1Var.c0(value, xj.n.D0((List) value, callback)));
        }

        public final void removeStorageEventCallback(b callback) {
            a1 a1Var;
            Object value;
            n.f(callback, "callback");
            n0 n0Var = Storage.onStorageEventCallbacks;
            do {
                a1Var = (a1) n0Var;
                value = a1Var.getValue();
            } while (!a1Var.c0(value, xj.n.y0((List) value, callback)));
        }

        private Companion() {
        }
    }

    public Storage(String _targetFileName, StorageManager.StorageType type) {
        n.f(_targetFileName, "_targetFileName");
        n.f(type, "type");
        this._targetFileName = _targetFileName;
        this.type = type;
    }

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public synchronized boolean readStorage() {
        boolean z10 = false;
        try {
            try {
                byte[] fileBytes = Utilities.readFileBytes(new File(this._targetFileName));
                if (fileBytes == null) {
                    return false;
                }
                setData(new JSONObject(new String(fileBytes, a.f3768a)));
                z10 = true;
            } catch (Exception e10) {
                DeviceLog.debug("Failed to read storage JSON file:", e10);
            }
        } catch (FileNotFoundException e11) {
            DeviceLog.debug("Storage JSON file not found in local cache:", e11);
        }
        return z10;
    }

    public final synchronized void sendEvent(StorageEvent eventType, Object value) {
        List list = (List) ((a1) onStorageEventCallbacks).getValue();
        if (list.isEmpty()) {
            if (!(WebViewApp.getCurrentApp() != null ? WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, eventType, this.type.name(), value) : false)) {
                DeviceLog.debug("Couldn't send storage event to WebApp");
            }
            return;
        }
        n.c(eventType);
        StorageEventInfo storageEventInfo = new StorageEventInfo(eventType, this.type, value);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((b) it.next()).invoke(storageEventInfo);
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() == null) {
            return false;
        }
        return Utilities.writeFile(file, getData().toString());
    }
}
