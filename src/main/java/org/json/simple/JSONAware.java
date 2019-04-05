package org.json.simple;

import org.checkerframework.checker.nullness.qual.Nullable;

/**
 * Beans that support customized output of JSON text shall implement this interface.  
 * @author FangYidong<fangyidong@yahoo.com.cn>
 */
public interface JSONAware {
	/**
	 * @return JSON text
	 */
	@Nullable String toJSONString();
}
