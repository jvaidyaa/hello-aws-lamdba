# hello-aws-lamdba
Say Hello to AWS Lambda Implementation

> AWS Lambda is a compute service that runs your code in response to events and automatically manages the compute resources for you,   making it easy to build applications that respond quickly to new information.

<img src="https://cdn-images-1.medium.com/max/800/1*gyPsuG8YwZhTx6TBHvWUEw.png" />
Source:<a href="http://research.gigaom.com/2015/01/why-aws-lambda-is-a-masterstroke-from-amazon/" data-href="http://research.gigaom.com/2015/01/why-aws-lambda-is-a-masterstroke-from-amazon/" class="markup--anchor markup--figure-anchor" rel="nofollow">Why AWS Lambda is a Masterstroke from Amazon</a>

> Amazon API Gateway is a fully managed service that makes it easy for developers to create, publish, maintain, monitor, and secure APIs at any scale.

Gradle Project
First thing you need deployment package, download the source code and run
> ./gradlew clean buildZip
Build/Distribution will have the ".zip" file ready for the deployment

Amazon Console
Next step: let’s create our Lambda function.
1. signup/signin to https://console.aws.amazon.com,
2. go to Lambda and create a lambda function called HelloLambda (you can skip the step 1 with nodejs blueprints),
select your .zip deployment package (hello-aws-lambda/build/distributions/hello-aws-lambda.zip) and enter your handle name org.gradle.HelloController::getHello,
3. create a role by choosing the Basic execution role from the list (if this is your first time, AWS Management Console will create an IAM role called basic_execution_role in your account with an access policy that allows only permission to write logs to CloudWatch Logs),
4. review your settings and create the function.
//IMAGE

Once your function has been created, you can test it with some sample input, in our case the following JSON string:

{
 "firstName": "DHANU"
}

When testing the function, you should get the following output:

{
  "response": "DHANU"
}

How will it scale?
> There are no fundamental limits to scaling a function. AWS Lambda will dynamically allocate capacity to match the rate of incoming events.

That great, but how much will it cost?
> With AWS Lambda, you pay only for what you use. You are charged based on the number of requests for your functions and the time your code executes. The Lambda free tier includes 1M free requests per month and 400,000 GB-seconds of compute time per month.

Conclusion
> A microservice built and deployed in less than 5 minutes.
No server, no instance, no container, no app server.
Just runnable code in the cloud!
