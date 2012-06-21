package org.eclipse.jetty.websocket.frames;

import java.nio.ByteBuffer;

import org.eclipse.jetty.util.BufferUtil;
import org.eclipse.jetty.websocket.api.OpCode;

/**
 * Representation of a <a href="https://tools.ietf.org/html/rfc6455#section-5.6">Binary Data Frame (0x02)</a>.
 */
public class BinaryFrame extends DataFrame
{

    /**
     * Default unspecified data
     */
    public BinaryFrame()
    {
        super(OpCode.BINARY);
    } 

    @Override
    public OpCode getOpCode()
    {
        return OpCode.BINARY;
    }

    
    
    
    @Override
    public void setPayload(ByteBuffer buffer)
    {
        // TODO Auto-generated method stub
        super.setPayload(buffer);
    }

    @Override
    public String toString()
    {
        StringBuilder b = new StringBuilder();
        b.append("BinaryFrame[");
        b.append("len=").append(getPayloadLength());
        b.append(",data=").append(BufferUtil.toDetailString(getPayload()));
        b.append("]");
        return b.toString();
    }
}
