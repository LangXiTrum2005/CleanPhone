package com.badlogic.gdx.net;

import com.badlogic.gdx.Net;
import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes.dex */
public class NetJavaServerSocketImpl implements ServerSocket {
    private Net.Protocol protocol;
    private java.net.ServerSocket server;

    public NetJavaServerSocketImpl(Net.Protocol protocol, int i, ServerSocketHints serverSocketHints) {
        this(protocol, null, i, serverSocketHints);
    }

    @Override // com.badlogic.gdx.net.ServerSocket
    public Socket accept(SocketHints socketHints) {
        try {
            return new NetJavaSocketImpl(this.server.accept(), socketHints);
        } catch (Exception e) {
            throw new GdxRuntimeException("Error accepting socket.", e);
        }
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        java.net.ServerSocket serverSocket = this.server;
        if (serverSocket != null) {
            try {
                serverSocket.close();
                this.server = null;
            } catch (Exception e) {
                throw new GdxRuntimeException("Error closing server.", e);
            }
        }
    }

    @Override // com.badlogic.gdx.net.ServerSocket
    public Net.Protocol getProtocol() {
        return this.protocol;
    }

    public NetJavaServerSocketImpl(Net.Protocol protocol, String str, int i, ServerSocketHints serverSocketHints) {
        this.protocol = protocol;
        try {
            java.net.ServerSocket serverSocket = new java.net.ServerSocket();
            this.server = serverSocket;
            if (serverSocketHints != null) {
                serverSocket.setPerformancePreferences(serverSocketHints.performancePrefConnectionTime, serverSocketHints.performancePrefLatency, serverSocketHints.performancePrefBandwidth);
                this.server.setReuseAddress(serverSocketHints.reuseAddress);
                this.server.setSoTimeout(serverSocketHints.acceptTimeout);
                this.server.setReceiveBufferSize(serverSocketHints.receiveBufferSize);
            }
            InetSocketAddress inetSocketAddress = str != null ? new InetSocketAddress(str, i) : new InetSocketAddress(i);
            if (serverSocketHints != null) {
                this.server.bind(inetSocketAddress, serverSocketHints.backlog);
            } else {
                this.server.bind(inetSocketAddress);
            }
        } catch (Exception e) {
            throw new GdxRuntimeException(AbstractC5044xl.g("Cannot create a server socket at port ", i, "."), e);
        }
    }
}
