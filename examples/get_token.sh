#!/bin/sh
curl \
  --silent \
  --fail \
  --header "Content-Type: application/json" \
  --request POST \
  --data "{\"client_id\": \"pulumi\",\"username\": \"${VENAFI_TPP_USER}\",\"password\": \"${VENAFI_TPP_PASSWORD}\",\"scope\": \"certificate:manage;configuration:manage\"}" \
  https://venafi-ecosystem-tpp.cld.sr/vedauth/authorize/oauth \
  | jq -jr '.access_token'
