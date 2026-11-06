# Task 3.3

You will need to [install the uv Python package manager][uv] to carry out
this task.

After installing it, cd into `tasks/task3_3` and enter

    uv init --vcs none

Then install [httpx][hx] with

    uv add 'httpx[cli]'

See the [Ktor Web Development Guide][task] for full details of what to do
next...


[uv]: https://docs.astral.sh/uv/#installation
[hx]: https://www.python-httpx.org/
[task]: https://comp2850.github.io/ktor-guide/http/requests#task-3-2

httpx https://www.example.com -v
* Connecting to 'www.example.com'
* Connected to '172.66.147.243' on port 443
* SSL established using 'TLSv1.3' / 'TLS_AES_256_GCM_SHA384'
* Selected ALPN protocol: 'http/1.1'
* Server certificate:
*   subject:
*     commonName: 'example.com'
*   issuer:
*     countryName: 'US'
*     organizationName: 'SSL Corporation'
*     commonName: 'Cloudflare TLS Issuing ECC CA 3'
*   version: 3
*   serialNumber: '01EEE6AABB521D5E14FC315FD9985690'
*   notBefore: 'Sep 26 22:49:11 2026 GMT'
*   notAfter: 'Dec 25 22:56:35 2026 GMT'
*   subjectAltName:
*     DNS: 'example.com'
*     DNS: '*.example.com'
*   OCSP:
*     'http://o.cf-i.ssl.com'
*   caIssuers:
*     'http://i.cf-i.ssl.com/Cloudflare-TLS-I-E3.cer'
*   crlDistributionPoints:
*     'http://c.cf-i.ssl.com/ae801ed1c55bb579d79208b0d772acfb8cc3a208.crl'
GET / HTTP/1.1
Host: www.example.com
Accept: */*
Accept-Encoding: gzip, deflate
Connection: keep-alive
User-Agent: python-httpx/0.28.1

HTTP/1.1 200 OK
Date: Fri, 06 Nov 2026 15:06:41 GMT
Content-Type: text/html; charset=utf-8
Transfer-Encoding: chunked
Connection: keep-alive
Server: cloudflare
last-modified: Thu, 05 Nov 2026 21:17:41 GMT
allow: GET, HEAD
Age: 1086
cf-cache-status: HIT
Content-Encoding: gzip
CF-RAY: a56500e7beb5b381-MAN
alt-svc: h3=":443"; ma=86400

<!doctype html><html lang=en><head><meta charset=utf-8><link rel=icon href=data:,><meta name=viewport content="width=device-width,initial-scale=1"><title>Example 
Domain</title><style>html{color-scheme:light dark;background:light-dark(#eee,#222)}body{font:16px/1.6 system-ui,sans-serif;max-width:26em;margin:auto;padding:25vh 2em 
2em;text-align:center}</style></head><body><p>This domain is for use in documentation examples without needing permission. This is not a service; avoid relying on it for testing and 
monitoring purposes.</p><script src=/s.js></script></body></html>