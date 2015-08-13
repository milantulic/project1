f(attribute != null) {
					//Get all the group members as String values
										Enumeration groupMembers = attribute.getStringValues();
															if(groupMembers != null) {				
																					while(groupMembers.hasMoreElements()) {
																												String nextMember = (String) groupMembers.nextElement();
																																			if (nextMember.indexOf(email) >= 0) {
																																											Log.logInfo(LogUtils.LOGGER_SAW_ACTION, "Access denied for user: " + nextMember);
																																																			return true;
																																																				                        }
																																																													}
																																																																		}
																																																																						}
