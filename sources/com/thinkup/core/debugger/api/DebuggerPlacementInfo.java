package com.thinkup.core.debugger.api;

/* JADX INFO: loaded from: classes6.dex */
public class DebuggerPlacementInfo {
    private DebuggerAdSourceInfo debuggerAdSourceInfo;
    private Object onlinePlaceGroupStrategy;
    private Object onlinePlacementConfig;
    private Object onlinePlacementStrategy;

    private DebuggerPlacementInfo(Object obj) {
        this.onlinePlaceGroupStrategy = obj;
    }

    public static DebuggerPlacementInfo create(Object obj, Object obj2) {
        return new DebuggerPlacementInfo(obj, obj2);
    }

    public DebuggerAdSourceInfo getDebuggerAdSourceInfo() {
        return this.debuggerAdSourceInfo;
    }

    public Object getOnlinePlaceGroupStrategy() {
        return this.onlinePlaceGroupStrategy;
    }

    public Object getOnlinePlacementConfig() {
        return this.onlinePlacementConfig;
    }

    public Object getOnlinePlacementStrategy() {
        return this.onlinePlacementStrategy;
    }

    public void setDebuggerAdSourceInfo(DebuggerAdSourceInfo debuggerAdSourceInfo) {
        this.debuggerAdSourceInfo = debuggerAdSourceInfo;
    }

    public static DebuggerPlacementInfo create(Object obj) {
        return new DebuggerPlacementInfo(obj);
    }

    private DebuggerPlacementInfo(Object obj, Object obj2) {
        this.onlinePlacementStrategy = obj2;
        this.onlinePlacementConfig = obj;
    }
}
