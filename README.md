# Anonymous-Facebook-Story-Viewer

Lets you view stories anonymously on facebook desktop (classic mode)

1-Go to your facebook homepage
2-Right click the story you want to see and click inspect
3-double click and copy the string of text between quotes after `data-onclick=` 
4-The copied text should look something like this `[{"mod":"FBStoriesTray2","meth":"onStoryTrayItemSelect","k":"stories-tray","a":[{"item":{"__elem":1},"bucketID":"1881444331521882203","traySessionID":"numbers","index":0,"preloadImageURIs":["https:\/\/scontent.fymy1-1.fna.fbcdn.net\/v\/t1.0-9\/numbers.jpg?_nc_cat=108&_nc_sid=8381dd97&_nc_ohc=9sXGqishYK4AX9-MOoK&_nc_ht=scontent.fymy1-1.fna&oh=numbers&oe=5F689C41",null,"https:\/\/scontent.fymy1-1.fna.fbcdn.net\/v\/t1.0-0\/fb10\/s235x350\/numbers.jpg?_nc_cat=108&_nc_sid=8381s97&_nc_ohc=9sXGsqishYK4AX9-MOoK&_nc_ht=scontent.fymy1-1.fna&oh=a3520354496cd02c75809704479a9d0fa9&oe=5F687025"],"preloadVideoIDs":[],"event":{"__event":1},"source":null,"trackingString":"{\"request_id\":\"b3e0f0fb-beb8-47ba-a48b-some number\",\"bucket_id\":\"some number\",\"owner_id\":\"some number\",\"scored_time\":0,\"ranker_join_key\":\"d0326654cd-b614-4e7b-9652-1b9da2c2846d\",\"raas_position\":31,\"raas_newly_scored_position\":-1,\"random_rate\":0,\"usecase_id\":\"1\",\"viewstate_token\":\"{\\\"shardManagerScope\\\":\\\"ldc\\\",\\\"snapshotId\\\":587521746722087810964,\\\"versionId\\\":0,\\\"creationTime\\\":15988140680,\\\"snaps9hotIndexWithinBatch\\\":0}\"}"}]}]`
5- Run story.jar and the story's full resolution image will open in new tab

